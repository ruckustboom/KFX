package kfx

import javafx.animation.PauseTransition
import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.property.*
import javafx.css.PseudoClass
import javafx.scene.control.TextField
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.util.Duration
import javafx.util.StringConverter

public enum class BlurAction { COMMIT, RESET, NONE }

public fun <T> TextField.editorFor(
    property: Property<T>,
    converter: StringConverter<T>,
    onBlur: BlurAction = BlurAction.COMMIT,
    invalidClass: PseudoClass? = null,
) {
    property.addAndRunListener { refresh(property, converter) }

    when (onBlur) {
        BlurAction.COMMIT -> focusedProperty().addListener { _, wasFocused, isFocused ->
            if (!isFocused && wasFocused) update(property, converter)
        }

        BlurAction.RESET -> focusedProperty().addListener { _, wasFocused, isFocused ->
            if (!isFocused && wasFocused) refresh(property, converter)
        }

        BlurAction.NONE -> Unit
    }

    addEventHandler(KeyEvent.KEY_PRESSED) {
        when (it?.code) {
            KeyCode.ENTER -> {
                update(property, converter)
                selectAll()
                it.consume()
            }

            KeyCode.ESCAPE -> {
                refresh(property, converter)
                parent?.requestFocus()
                it.consume()
            }

            else -> Unit
        }
    }

    if (invalidClass != null) {
        textProperty().addListener(ValidationListener(this, converter, invalidClass))
    }
}

public abstract class SimpleStringConverter<T> : StringConverter<T>() {
    override fun toString(value: T): String = value.toString()
}

// Int

@Suppress("UNCHECKED_CAST")
public fun TextField.editorFor(property: IntegerProperty, converter: StringConverter<Int>) {
    editorFor(property as Property<Int>, converter)
}

public object IntConverter : SimpleStringConverter<Int>() {
    override fun fromString(string: String): Int = string.toInt()
}

// Long

@Suppress("UNCHECKED_CAST")
public fun TextField.editorFor(property: LongProperty, converter: StringConverter<Long>) {
    editorFor(property as Property<Long>, converter)
}

public object LongConverter : SimpleStringConverter<Long>() {
    override fun fromString(string: String): Long = string.toLong()
}

// Float

@Suppress("UNCHECKED_CAST")
public fun TextField.editorFor(property: FloatProperty, converter: StringConverter<Float>) {
    editorFor(property as Property<Float>, converter)
}

public object FloatConverter : SimpleStringConverter<Float>() {
    override fun fromString(string: String): Float = string.toFloat()
}

// Double

@Suppress("UNCHECKED_CAST")
public fun TextField.editorFor(property: DoubleProperty, converter: StringConverter<Double>) {
    editorFor(property as Property<Double>, converter)
}

public object DoubleConverter : SimpleStringConverter<Double>() {
    override fun fromString(string: String): Double = string.toDouble()
}

// String

public class RegexConverter(private val regex: Regex? = null) : StringConverter<String>() {
    override fun toString(value: String): String = value
    override fun fromString(string: String): String {
        if (regex != null) require(regex matches string)
        return string
    }
}

// Impl

private fun <T> TextField.update(property: Property<T>, converter: StringConverter<T>) {
    try {
        property.value = converter.fromString(text)
    } finally {
        refresh(property, converter)
    }
}

private fun <T> TextField.refresh(property: Property<T>, converter: StringConverter<T>) {
    text = converter.toString(property.value)
}

private class ValidationListener(
    val field: TextField,
    val converter: StringConverter<*>,
    val pseudoClass: PseudoClass,
) : InvalidationListener {
    private val debounce = PauseTransition(Duration.seconds(0.1)).apply {
        setOnFinished { check() }
    }

    override fun invalidated(observable: Observable?) {
        debounce.playFromStart()
    }

    private fun check() {
        field[pseudoClass] = try {
            converter.fromString(field.text)
            false
        } catch (e: Exception) {
            true
        }
    }
}

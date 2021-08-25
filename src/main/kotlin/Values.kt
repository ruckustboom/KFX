@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableObjectValue
import javafx.beans.value.ObservableValue

public typealias ObservableObject<T> = ObservableObjectValue<T>

public fun <R> objectBinding(vararg dependencies: Observable, func: () -> R): ObjectBinding<R> =
    createObjectBinding(func, *dependencies)

public fun <T> ObservableValue<T>.booleanBinding(vararg dependencies: Observable, func: (T) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(value) }, this, *dependencies)

public fun <T> ObservableValue<T>.intBinding(vararg dependencies: Observable, func: (T) -> Int): IntBinding =
    createIntegerBinding({ func(value) }, this, *dependencies)

public fun <T> ObservableValue<T>.longBinding(vararg dependencies: Observable, func: (T) -> Long): LongBinding =
    createLongBinding({ func(value) }, this, *dependencies)

public fun <T> ObservableValue<T>.floatBinding(vararg dependencies: Observable, func: (T) -> Float): FloatBinding =
    createFloatBinding({ func(value) }, this, *dependencies)

public fun <T> ObservableValue<T>.doubleBinding(vararg dependencies: Observable, func: (T) -> Double): DoubleBinding =
    createDoubleBinding({ func(value) }, this, *dependencies)

public fun <T> ObservableValue<T>.stringBinding(vararg dependencies: Observable, func: (T) -> String?): StringBinding =
    createStringBinding({ func(value) }, this, *dependencies)

public fun <T, R> ObservableValue<T>.objectBinding(vararg dependencies: Observable, func: (T) -> R): ObjectBinding<R> =
    createObjectBinding({ func(value) }, this, *dependencies)

public fun ObservableValue<*>.selectBoolean(vararg steps: String): BooleanBinding = selectBoolean(this, *steps)
public fun ObservableValue<*>.selectInt(vararg steps: String): IntegerBinding = selectInteger(this, *steps)
public fun ObservableValue<*>.selectLong(vararg steps: String): LongBinding = selectLong(this, *steps)
public fun ObservableValue<*>.selectFloat(vararg steps: String): FloatBinding = selectFloat(this, *steps)
public fun ObservableValue<*>.selectDouble(vararg steps: String): DoubleBinding = selectDouble(this, *steps)
public fun ObservableValue<*>.selectString(vararg steps: String): StringBinding = selectString(this, *steps)
public fun <T> ObservableValue<*>.select(vararg steps: String): ObjectBinding<T> = select(this, *steps)

public inline fun ObservableValue<*>.asString(): StringExpression = convert(this)

public inline fun given(condition: ObservableBoolean): When = `when`(condition)

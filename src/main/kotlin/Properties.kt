package kfx

import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.value.*
import kotlin.reflect.KProperty

public fun Observable.addAndRunListener(listener: InvalidationListener) {
    addListener(listener)
    listener.invalidated(this)
}

// Delegation

public operator fun ObservableBooleanValue.getValue(thisRef: Any?, property: KProperty<*>): Boolean = get()
public operator fun WritableBooleanValue.setValue(thisRef: Any?, property: KProperty<*>, value: Boolean): Unit =
    set(value)

public operator fun ObservableIntegerValue.getValue(thisRef: Any?, property: KProperty<*>): Int = get()
public operator fun WritableIntegerValue.setValue(thisRef: Any?, property: KProperty<*>, value: Int): Unit =
    set(value)

public operator fun ObservableLongValue.getValue(thisRef: Any?, property: KProperty<*>): Long = get()
public operator fun WritableLongValue.setValue(thisRef: Any?, property: KProperty<*>, value: Long): Unit =
    set(value)

public operator fun ObservableFloatValue.getValue(thisRef: Any?, property: KProperty<*>): Float = get()
public operator fun WritableFloatValue.setValue(thisRef: Any?, property: KProperty<*>, value: Float): Unit =
    set(value)

public operator fun ObservableDoubleValue.getValue(thisRef: Any?, property: KProperty<*>): Double = get()
public operator fun WritableDoubleValue.setValue(thisRef: Any?, property: KProperty<*>, value: Double): Unit =
    set(value)

public operator fun <T> ObservableValue<T>.getValue(thisRef: Any?, property: KProperty<*>): T = value
public operator fun <T> WritableValue<T>.setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    this.value = value
}

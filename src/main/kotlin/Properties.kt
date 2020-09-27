package kfx

import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.property.IntegerProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.value.*
import kotlin.reflect.KProperty

public typealias WritableBoolean = WritableBooleanValue
public typealias WritableInt = WritableIntegerValue
public typealias WritableLong = WritableLongValue
public typealias WritableFloat = WritableFloatValue
public typealias WritableDouble = WritableDoubleValue
public typealias WritableString = WritableStringValue
public typealias WritableObject<T> = WritableObjectValue<T>

public typealias IntProperty = IntegerProperty
public typealias SimpleIntProperty = SimpleIntegerProperty

public fun Observable.addAndRunListener(listener: InvalidationListener) {
    addListener(listener)
    listener.invalidated(this)
}

// Delegation

public operator fun ObservableBoolean.getValue(thisRef: Any?, property: KProperty<*>): Boolean = get()
public operator fun WritableBoolean.setValue(thisRef: Any?, property: KProperty<*>, value: Boolean) {
    set(value)
}

public operator fun ObservableInt.getValue(thisRef: Any?, property: KProperty<*>): Int = get()
public operator fun WritableInt.setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
    set(value)
}

public operator fun ObservableLong.getValue(thisRef: Any?, property: KProperty<*>): Long = get()
public operator fun WritableLong.setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
    set(value)
}

public operator fun ObservableFloat.getValue(thisRef: Any?, property: KProperty<*>): Float = get()
public operator fun WritableFloat.setValue(thisRef: Any?, property: KProperty<*>, value: Float) {
    set(value)
}

public operator fun ObservableDouble.getValue(thisRef: Any?, property: KProperty<*>): Double = get()
public operator fun WritableDouble.setValue(thisRef: Any?, property: KProperty<*>, value: Double) {
    set(value)
}

public operator fun <T> ObservableValue<T>.getValue(thisRef: Any?, property: KProperty<*>): T = value
public operator fun <T> WritableValue<T>.setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    this.value = value
}

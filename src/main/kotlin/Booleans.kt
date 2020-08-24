@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableBooleanValue

public typealias ObservableBoolean = ObservableBooleanValue

public fun booleanBinding(vararg dependencies: Observable, func: () -> Boolean): BooleanBinding =
    createBooleanBinding(func, *dependencies)

public fun ObservableBoolean.booleanBinding(vararg dependencies: Observable, func: (Boolean) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableBoolean.intBinding(vararg dependencies: Observable, func: (Boolean) -> Int): IntBinding =
    createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableBoolean.longBinding(vararg dependencies: Observable, func: (Boolean) -> Long): LongBinding =
    createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableBoolean.floatBinding(vararg dependencies: Observable, func: (Boolean) -> Float): FloatBinding =
    createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableBoolean.doubleBinding(vararg dependencies: Observable, func: (Boolean) -> Double): DoubleBinding =
    createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableBoolean.stringBinding(vararg dependencies: Observable, func: (Boolean) -> String?): StringBinding =
    createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableBoolean.objectBinding(vararg dependencies: Observable, func: (Boolean) -> R): ObjectBinding<R> =
    createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableBoolean.not(): BooleanBinding = not(this)
public inline infix fun ObservableBoolean.and(value: ObservableBoolean): BooleanBinding = and(this, value)
public inline infix fun ObservableBoolean.or(value: ObservableBoolean): BooleanBinding = or(this, value)
public inline infix fun ObservableBoolean.xor(value: ObservableBoolean): BooleanBinding =
    booleanBinding(value) { it xor value.get() }

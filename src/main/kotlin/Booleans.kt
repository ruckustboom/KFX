@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableBooleanValue

public fun booleanBinding(
    vararg dependencies: Observable,
    func: () -> Boolean,
): BooleanBinding = createBooleanBinding(func, *dependencies)

public fun ObservableBooleanValue.booleanBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> Boolean,
): BooleanBinding = createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableBooleanValue.intBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> Int,
): IntegerBinding = createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableBooleanValue.longBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> Long,
): LongBinding = createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableBooleanValue.floatBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> Float,
): FloatBinding = createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableBooleanValue.doubleBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> Double,
): DoubleBinding = createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableBooleanValue.stringBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> String?,
): StringBinding = createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableBooleanValue.objectBinding(
    vararg dependencies: Observable,
    func: (Boolean) -> R,
): ObjectBinding<R> = createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableBooleanValue.not(): BooleanBinding =
    not(this)

public inline infix fun ObservableBooleanValue.and(value: ObservableBooleanValue): BooleanBinding =
    and(this, value)

public inline infix fun ObservableBooleanValue.or(value: ObservableBooleanValue): BooleanBinding =
    or(this, value)

public inline infix fun ObservableBooleanValue.xor(value: ObservableBooleanValue): BooleanBinding =
    booleanBinding(value) { it xor value.get() }

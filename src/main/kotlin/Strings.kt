@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableStringValue

public fun stringBinding(
    vararg dependencies: Observable,
    func: () -> String?,
): StringBinding = createStringBinding(func, *dependencies)

public fun ObservableStringValue.booleanBinding(
    vararg dependencies: Observable,
    func: (String?) -> Boolean,
): BooleanBinding = createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableStringValue.intBinding(
    vararg dependencies: Observable,
    func: (String?) -> Int,
): IntegerBinding = createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableStringValue.longBinding(
    vararg dependencies: Observable,
    func: (String?) -> Long,
): LongBinding = createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableStringValue.floatBinding(
    vararg dependencies: Observable,
    func: (String?) -> Float,
): FloatBinding = createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableStringValue.doubleBinding(
    vararg dependencies: Observable,
    func: (String?) -> Double,
): DoubleBinding = createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableStringValue.stringBinding(
    vararg dependencies: Observable,
    func: (String?) -> String?,
): StringBinding = createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableStringValue.objectBinding(
    vararg dependencies: Observable,
    func: (String?) -> R,
): ObjectBinding<R> = createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableStringValue.plus(value: Any?): StringExpression =
    concat(this, value)

@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableDoubleValue
import javafx.beans.value.ObservableFloatValue
import javafx.beans.value.ObservableIntegerValue
import javafx.beans.value.ObservableLongValue

public fun longBinding(
    vararg dependencies: Observable,
    func: () -> Long,
): LongBinding = createLongBinding(func, *dependencies)

public fun ObservableLongValue.booleanBinding(
    vararg dependencies: Observable,
    func: (Long) -> Boolean,
): BooleanBinding = createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableLongValue.intBinding(
    vararg dependencies: Observable,
    func: (Long) -> Int,
): IntegerBinding = createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableLongValue.longBinding(
    vararg dependencies: Observable,
    func: (Long) -> Long,
): LongBinding = createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableLongValue.floatBinding(
    vararg dependencies: Observable,
    func: (Long) -> Float,
): FloatBinding = createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableLongValue.doubleBinding(
    vararg dependencies: Observable,
    func: (Long) -> Double,
): DoubleBinding = createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableLongValue.stringBinding(
    vararg dependencies: Observable,
    func: (Long) -> String?,
): StringBinding = createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableLongValue.objectBinding(
    vararg dependencies: Observable,
    func: (Long) -> R,
): ObjectBinding<R> = createObjectBinding({ func(get()) }, this, *dependencies)


public inline operator fun ObservableLongValue.unaryMinus(): LongBinding =
    negate(this) as LongBinding


public inline operator fun Long.plus(value: ObservableIntegerValue): LongBinding =
    add(this, value) as LongBinding

public inline operator fun Long.plus(value: ObservableLongValue): LongBinding =
    add(this, value) as LongBinding

public inline operator fun Long.plus(value: ObservableFloatValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun Long.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.plus(value: Int): LongBinding =
    add(this, value) as LongBinding

public inline operator fun ObservableLongValue.plus(value: Long): LongBinding =
    add(this, value) as LongBinding

public inline operator fun ObservableLongValue.plus(value: Float): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableLongValue.plus(value: Double): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.plus(value: ObservableIntegerValue): LongBinding =
    add(this, value) as LongBinding

public inline operator fun ObservableLongValue.plus(value: ObservableLongValue): LongBinding =
    add(this, value) as LongBinding

public inline operator fun ObservableLongValue.plus(value: ObservableFloatValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableLongValue.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding


public inline operator fun Long.minus(value: ObservableIntegerValue): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun Long.minus(value: ObservableLongValue): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun Long.minus(value: ObservableFloatValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun Long.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.minus(value: Int): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun ObservableLongValue.minus(value: Long): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun ObservableLongValue.minus(value: Float): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableLongValue.minus(value: Double): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.minus(value: ObservableIntegerValue): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun ObservableLongValue.minus(value: ObservableLongValue): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun ObservableLongValue.minus(value: ObservableFloatValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableLongValue.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding


public inline operator fun Long.times(value: ObservableIntegerValue): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun Long.times(value: ObservableLongValue): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun Long.times(value: ObservableFloatValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun Long.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.times(value: Int): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun ObservableLongValue.times(value: Long): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun ObservableLongValue.times(value: Float): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableLongValue.times(value: Double): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.times(value: ObservableIntegerValue): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun ObservableLongValue.times(value: ObservableLongValue): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun ObservableLongValue.times(value: ObservableFloatValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableLongValue.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding


public inline operator fun Long.div(value: ObservableIntegerValue): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun Long.div(value: ObservableLongValue): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun Long.div(value: ObservableFloatValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun Long.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.div(value: Int): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun ObservableLongValue.div(value: Long): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun ObservableLongValue.div(value: Float): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableLongValue.div(value: Double): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.div(value: ObservableIntegerValue): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun ObservableLongValue.div(value: ObservableLongValue): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun ObservableLongValue.div(value: ObservableFloatValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableLongValue.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding


public inline operator fun Long.rem(value: ObservableIntegerValue): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun Long.rem(value: ObservableLongValue): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun Long.rem(value: ObservableFloatValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun Long.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.rem(value: Int): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun ObservableLongValue.rem(value: Long): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun ObservableLongValue.rem(value: Float): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableLongValue.rem(value: Double): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableLongValue.rem(value: ObservableIntegerValue): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun ObservableLongValue.rem(value: ObservableLongValue): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun ObservableLongValue.rem(value: ObservableFloatValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableLongValue.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

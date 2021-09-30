@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableDoubleValue
import javafx.beans.value.ObservableFloatValue
import javafx.beans.value.ObservableIntegerValue
import javafx.beans.value.ObservableLongValue

public fun intBinding(
    vararg dependencies: Observable,
    func: () -> Int,
): IntegerBinding = createIntegerBinding(func, *dependencies)

public fun ObservableIntegerValue.booleanBinding(
    vararg dependencies: Observable,
    func: (Int) -> Boolean,
): BooleanBinding = createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableIntegerValue.intBinding(
    vararg dependencies: Observable,
    func: (Int) -> Int,
): IntegerBinding = createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableIntegerValue.longBinding(
    vararg dependencies: Observable,
    func: (Int) -> Long,
): LongBinding = createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableIntegerValue.floatBinding(
    vararg dependencies: Observable,
    func: (Int) -> Float,
): FloatBinding = createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableIntegerValue.doubleBinding(
    vararg dependencies: Observable,
    func: (Int) -> Double,
): DoubleBinding = createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableIntegerValue.stringBinding(
    vararg dependencies: Observable,
    func: (Int) -> String?,
): StringBinding = createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableIntegerValue.objectBinding(
    vararg dependencies: Observable,
    func: (Int) -> R,
): ObjectBinding<R> = createObjectBinding({ func(get()) }, this, *dependencies)


public inline operator fun ObservableIntegerValue.unaryMinus(): IntegerBinding =
    negate(this) as IntegerBinding


public inline operator fun Int.plus(value: ObservableIntegerValue): IntegerBinding =
    add(this, value) as IntegerBinding

public inline operator fun Int.plus(value: ObservableLongValue): LongBinding =
    add(this, value) as LongBinding

public inline operator fun Int.plus(value: ObservableFloatValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun Int.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.plus(value: Int): IntegerBinding =
    add(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.plus(value: Long): LongBinding =
    add(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.plus(value: Float): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.plus(value: Double): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.plus(value: ObservableIntegerValue): IntegerBinding =
    add(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.plus(value: ObservableLongValue): LongBinding =
    add(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.plus(value: ObservableFloatValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding


public inline operator fun Int.minus(value: ObservableIntegerValue): IntegerBinding =
    subtract(this, value) as IntegerBinding

public inline operator fun Int.minus(value: ObservableLongValue): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun Int.minus(value: ObservableFloatValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun Int.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.minus(value: Int): IntegerBinding =
    subtract(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.minus(value: Long): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.minus(value: Float): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.minus(value: Double): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.minus(value: ObservableIntegerValue): IntegerBinding =
    subtract(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.minus(value: ObservableLongValue): LongBinding =
    subtract(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.minus(value: ObservableFloatValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding


public inline operator fun Int.times(value: ObservableIntegerValue): IntegerBinding =
    multiply(this, value) as IntegerBinding

public inline operator fun Int.times(value: ObservableLongValue): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun Int.times(value: ObservableFloatValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun Int.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.times(value: Int): IntegerBinding =
    multiply(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.times(value: Long): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.times(value: Float): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.times(value: Double): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.times(value: ObservableIntegerValue): IntegerBinding =
    multiply(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.times(value: ObservableLongValue): LongBinding =
    multiply(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.times(value: ObservableFloatValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding


public inline operator fun Int.div(value: ObservableIntegerValue): IntegerBinding =
    divide(this, value) as IntegerBinding

public inline operator fun Int.div(value: ObservableLongValue): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun Int.div(value: ObservableFloatValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun Int.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.div(value: Int): IntegerBinding =
    divide(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.div(value: Long): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.div(value: Float): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.div(value: Double): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.div(value: ObservableIntegerValue): IntegerBinding =
    divide(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.div(value: ObservableLongValue): LongBinding =
    divide(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.div(value: ObservableFloatValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding


public inline operator fun Int.rem(value: ObservableIntegerValue): IntegerBinding =
    remainder(this, value) as IntegerBinding

public inline operator fun Int.rem(value: ObservableLongValue): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun Int.rem(value: ObservableFloatValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun Int.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.rem(value: Int): IntegerBinding =
    remainder(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.rem(value: Long): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.rem(value: Float): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.rem(value: Double): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableIntegerValue.rem(value: ObservableIntegerValue): IntegerBinding =
    remainder(this, value) as IntegerBinding

public inline operator fun ObservableIntegerValue.rem(value: ObservableLongValue): LongBinding =
    remainder(this, value) as LongBinding

public inline operator fun ObservableIntegerValue.rem(value: ObservableFloatValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableIntegerValue.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

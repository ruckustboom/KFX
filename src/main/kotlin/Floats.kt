@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableDoubleValue
import javafx.beans.value.ObservableFloatValue
import javafx.beans.value.ObservableIntegerValue
import javafx.beans.value.ObservableLongValue

public fun floatBinding(
    vararg dependencies: Observable,
    func: () -> Float,
): FloatBinding = createFloatBinding(func, *dependencies)

public fun ObservableFloatValue.booleanBinding(
    vararg dependencies: Observable,
    func: (Float) -> Boolean,
): BooleanBinding = createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloatValue.intBinding(
    vararg dependencies: Observable,
    func: (Float) -> Int,
): IntegerBinding = createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloatValue.longBinding(
    vararg dependencies: Observable,
    func: (Float) -> Long,
): LongBinding = createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloatValue.floatBinding(
    vararg dependencies: Observable,
    func: (Float) -> Float,
): FloatBinding = createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloatValue.doubleBinding(
    vararg dependencies: Observable,
    func: (Float) -> Double,
): DoubleBinding = createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloatValue.stringBinding(
    vararg dependencies: Observable,
    func: (Float) -> String?,
): StringBinding = createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableFloatValue.objectBinding(
    vararg dependencies: Observable,
    func: (Float) -> R,
): ObjectBinding<R> = createObjectBinding({ func(get()) }, this, *dependencies)


public inline operator fun ObservableFloatValue.unaryMinus(): FloatBinding =
    negate(this) as FloatBinding


public inline operator fun Float.plus(value: ObservableIntegerValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun Float.plus(value: ObservableLongValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun Float.plus(value: ObservableFloatValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun Float.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.plus(value: Int): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.plus(value: Long): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.plus(value: Float): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.plus(value: Double): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.plus(value: ObservableIntegerValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.plus(value: ObservableLongValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.plus(value: ObservableFloatValue): FloatBinding =
    add(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding


public inline operator fun Float.minus(value: ObservableIntegerValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun Float.minus(value: ObservableLongValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun Float.minus(value: ObservableFloatValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun Float.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.minus(value: Int): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.minus(value: Long): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.minus(value: Float): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.minus(value: Double): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.minus(value: ObservableIntegerValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.minus(value: ObservableLongValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.minus(value: ObservableFloatValue): FloatBinding =
    subtract(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding


public inline operator fun Float.times(value: ObservableIntegerValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun Float.times(value: ObservableLongValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun Float.times(value: ObservableFloatValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun Float.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.times(value: Int): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.times(value: Long): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.times(value: Float): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.times(value: Double): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.times(value: ObservableIntegerValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.times(value: ObservableLongValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.times(value: ObservableFloatValue): FloatBinding =
    multiply(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding


public inline operator fun Float.div(value: ObservableIntegerValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun Float.div(value: ObservableLongValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun Float.div(value: ObservableFloatValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun Float.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.div(value: Int): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.div(value: Long): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.div(value: Float): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.div(value: Double): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.div(value: ObservableIntegerValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.div(value: ObservableLongValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.div(value: ObservableFloatValue): FloatBinding =
    divide(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding


public inline operator fun Float.rem(value: ObservableIntegerValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun Float.rem(value: ObservableLongValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun Float.rem(value: ObservableFloatValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun Float.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.rem(value: Int): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.rem(value: Long): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.rem(value: Float): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.rem(value: Double): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableFloatValue.rem(value: ObservableIntegerValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.rem(value: ObservableLongValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.rem(value: ObservableFloatValue): FloatBinding =
    remainder(this, value) as FloatBinding

public inline operator fun ObservableFloatValue.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

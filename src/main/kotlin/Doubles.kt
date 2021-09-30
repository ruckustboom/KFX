@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableDoubleValue
import javafx.beans.value.ObservableFloatValue
import javafx.beans.value.ObservableIntegerValue
import javafx.beans.value.ObservableLongValue

public fun doubleBinding(
    vararg dependencies: Observable,
    func: () -> Double,
): DoubleBinding = createDoubleBinding(func, *dependencies)

public fun ObservableDoubleValue.booleanBinding(
    vararg dependencies: Observable,
    func: (Double) -> Boolean,
): BooleanBinding = createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableDoubleValue.intBinding(
    vararg dependencies: Observable,
    func: (Double) -> Int,
): IntegerBinding = createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableDoubleValue.longBinding(
    vararg dependencies: Observable,
    func: (Double) -> Long,
): LongBinding = createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableDoubleValue.floatBinding(
    vararg dependencies: Observable,
    func: (Double) -> Float,
): FloatBinding = createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableDoubleValue.doubleBinding(
    vararg dependencies: Observable,
    func: (Double) -> Double,
): DoubleBinding = createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableDoubleValue.stringBinding(
    vararg dependencies: Observable,
    func: (Double) -> String?,
): StringBinding = createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableDoubleValue.objectBinding(
    vararg dependencies: Observable,
    func: (Double) -> R,
): ObjectBinding<R> = createObjectBinding({ func(get()) }, this, *dependencies)


public inline operator fun ObservableDoubleValue.unaryMinus(): DoubleBinding =
    negate(this) as DoubleBinding


public inline operator fun Double.plus(value: ObservableIntegerValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun Double.plus(value: ObservableLongValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun Double.plus(value: ObservableFloatValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun Double.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: Int): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: Long): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: Float): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: Double): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: ObservableIntegerValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: ObservableLongValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: ObservableFloatValue): DoubleBinding =
    add(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.plus(value: ObservableDoubleValue): DoubleBinding =
    add(this, value) as DoubleBinding


public inline operator fun Double.minus(value: ObservableIntegerValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun Double.minus(value: ObservableLongValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun Double.minus(value: ObservableFloatValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun Double.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: Int): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: Long): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: Float): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: Double): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: ObservableIntegerValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: ObservableLongValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: ObservableFloatValue): DoubleBinding =
    subtract(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.minus(value: ObservableDoubleValue): DoubleBinding =
    subtract(this, value) as DoubleBinding


public inline operator fun Double.times(value: ObservableIntegerValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun Double.times(value: ObservableLongValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun Double.times(value: ObservableFloatValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun Double.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: Int): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: Long): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: Float): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: Double): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: ObservableIntegerValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: ObservableLongValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: ObservableFloatValue): DoubleBinding =
    multiply(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.times(value: ObservableDoubleValue): DoubleBinding =
    multiply(this, value) as DoubleBinding


public inline operator fun Double.div(value: ObservableIntegerValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun Double.div(value: ObservableLongValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun Double.div(value: ObservableFloatValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun Double.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: Int): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: Long): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: Float): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: Double): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: ObservableIntegerValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: ObservableLongValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: ObservableFloatValue): DoubleBinding =
    divide(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.div(value: ObservableDoubleValue): DoubleBinding =
    divide(this, value) as DoubleBinding


public inline operator fun Double.rem(value: ObservableIntegerValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun Double.rem(value: ObservableLongValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun Double.rem(value: ObservableFloatValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun Double.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: Int): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: Long): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: Float): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: Double): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: ObservableIntegerValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: ObservableLongValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: ObservableFloatValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

public inline operator fun ObservableDoubleValue.rem(value: ObservableDoubleValue): DoubleBinding =
    remainder(this, value) as DoubleBinding

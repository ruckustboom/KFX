@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableLongValue

public typealias ObservableLong = ObservableLongValue

public fun longBinding(vararg dependencies: Observable, func: () -> Long): LongBinding =
    createLongBinding(func, *dependencies)

public fun ObservableLong.booleanBinding(vararg dependencies: Observable, func: (Long) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableLong.intBinding(vararg dependencies: Observable, func: (Long) -> Int): IntBinding =
    createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableLong.longBinding(vararg dependencies: Observable, func: (Long) -> Long): LongBinding =
    createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableLong.floatBinding(vararg dependencies: Observable, func: (Long) -> Float): FloatBinding =
    createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableLong.doubleBinding(vararg dependencies: Observable, func: (Long) -> Double): DoubleBinding =
    createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableLong.stringBinding(vararg dependencies: Observable, func: (Long) -> String?): StringBinding =
    createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableLong.objectBinding(vararg dependencies: Observable, func: (Long) -> R): ObjectBinding<R> =
    createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableLong.unaryMinus(): LongBinding = negate(this) as LongBinding

public inline operator fun Long.plus(value: ObservableInt): LongBinding = add(this, value) as LongBinding
public inline operator fun Long.plus(value: ObservableLong): LongBinding = add(this, value) as LongBinding
public inline operator fun Long.plus(value: ObservableFloat): FloatBinding = add(this, value) as FloatBinding
public inline operator fun Long.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableLong.plus(value: Int): LongBinding = add(this, value) as LongBinding
public inline operator fun ObservableLong.plus(value: Long): LongBinding = add(this, value) as LongBinding
public inline operator fun ObservableLong.plus(value: Float): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableLong.plus(value: Double): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableLong.plus(value: ObservableInt): LongBinding = add(this, value) as LongBinding
public inline operator fun ObservableLong.plus(value: ObservableLong): LongBinding = add(this, value) as LongBinding
public inline operator fun ObservableLong.plus(value: ObservableFloat): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableLong.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding

public inline operator fun Long.minus(value: ObservableInt): LongBinding = subtract(this, value) as LongBinding
public inline operator fun Long.minus(value: ObservableLong): LongBinding = subtract(this, value) as LongBinding
public inline operator fun Long.minus(value: ObservableFloat): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun Long.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableLong.minus(value: Int): LongBinding = subtract(this, value) as LongBinding
public inline operator fun ObservableLong.minus(value: Long): LongBinding = subtract(this, value) as LongBinding
public inline operator fun ObservableLong.minus(value: Float): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableLong.minus(value: Double): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableLong.minus(value: ObservableInt): LongBinding = subtract(this, value) as LongBinding
public inline operator fun ObservableLong.minus(value: ObservableLong): LongBinding = subtract(this, value) as LongBinding
public inline operator fun ObservableLong.minus(value: ObservableFloat): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableLong.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding

public inline operator fun Long.times(value: ObservableInt): LongBinding = multiply(this, value) as LongBinding
public inline operator fun Long.times(value: ObservableLong): LongBinding = multiply(this, value) as LongBinding
public inline operator fun Long.times(value: ObservableFloat): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun Long.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableLong.times(value: Int): LongBinding = multiply(this, value) as LongBinding
public inline operator fun ObservableLong.times(value: Long): LongBinding = multiply(this, value) as LongBinding
public inline operator fun ObservableLong.times(value: Float): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableLong.times(value: Double): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableLong.times(value: ObservableInt): LongBinding = multiply(this, value) as LongBinding
public inline operator fun ObservableLong.times(value: ObservableLong): LongBinding = multiply(this, value) as LongBinding
public inline operator fun ObservableLong.times(value: ObservableFloat): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableLong.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding

public inline operator fun Long.div(value: ObservableInt): LongBinding = divide(this, value) as LongBinding
public inline operator fun Long.div(value: ObservableLong): LongBinding = divide(this, value) as LongBinding
public inline operator fun Long.div(value: ObservableFloat): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun Long.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableLong.div(value: Int): LongBinding = divide(this, value) as LongBinding
public inline operator fun ObservableLong.div(value: Long): LongBinding = divide(this, value) as LongBinding
public inline operator fun ObservableLong.div(value: Float): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableLong.div(value: Double): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableLong.div(value: ObservableInt): LongBinding = divide(this, value) as LongBinding
public inline operator fun ObservableLong.div(value: ObservableLong): LongBinding = divide(this, value) as LongBinding
public inline operator fun ObservableLong.div(value: ObservableFloat): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableLong.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding

public inline operator fun Long.rem(value: ObservableInt): LongBinding = remainder(this, value) as LongBinding
public inline operator fun Long.rem(value: ObservableLong): LongBinding = remainder(this, value) as LongBinding
public inline operator fun Long.rem(value: ObservableFloat): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun Long.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableLong.rem(value: Int): LongBinding = remainder(this, value) as LongBinding
public inline operator fun ObservableLong.rem(value: Long): LongBinding = remainder(this, value) as LongBinding
public inline operator fun ObservableLong.rem(value: Float): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableLong.rem(value: Double): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableLong.rem(value: ObservableInt): LongBinding = remainder(this, value) as LongBinding
public inline operator fun ObservableLong.rem(value: ObservableLong): LongBinding = remainder(this, value) as LongBinding
public inline operator fun ObservableLong.rem(value: ObservableFloat): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableLong.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding

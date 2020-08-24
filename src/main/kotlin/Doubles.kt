@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableDoubleValue

public typealias ObservableDouble = ObservableDoubleValue

public fun doubleBinding(vararg dependencies: Observable, func: () -> Double): DoubleBinding =
    createDoubleBinding(func, *dependencies)

public fun ObservableDouble.booleanBinding(vararg dependencies: Observable, func: (Double) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableDouble.intBinding(vararg dependencies: Observable, func: (Double) -> Int): IntBinding =
    createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableDouble.longBinding(vararg dependencies: Observable, func: (Double) -> Long): LongBinding =
    createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableDouble.floatBinding(vararg dependencies: Observable, func: (Double) -> Float): FloatBinding =
    createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableDouble.doubleBinding(vararg dependencies: Observable, func: (Double) -> Double): DoubleBinding =
    createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableDouble.stringBinding(vararg dependencies: Observable, func: (Double) -> String?): StringBinding =
    createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableDouble.objectBinding(vararg dependencies: Observable, func: (Double) -> R): ObjectBinding<R> =
    createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableDouble.unaryMinus(): DoubleBinding = negate(this) as DoubleBinding

public inline operator fun Double.plus(value: ObservableInt): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun Double.plus(value: ObservableLong): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun Double.plus(value: ObservableFloat): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun Double.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: Int): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: Long): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: Float): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: Double): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: ObservableInt): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: ObservableLong): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: ObservableFloat): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableDouble.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding

public inline operator fun Double.minus(value: ObservableInt): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun Double.minus(value: ObservableLong): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun Double.minus(value: ObservableFloat): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun Double.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: Int): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: Long): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: Float): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: Double): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: ObservableInt): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: ObservableLong): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: ObservableFloat): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableDouble.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding

public inline operator fun Double.times(value: ObservableInt): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun Double.times(value: ObservableLong): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun Double.times(value: ObservableFloat): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun Double.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: Int): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: Long): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: Float): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: Double): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: ObservableInt): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: ObservableLong): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: ObservableFloat): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableDouble.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding

public inline operator fun Double.div(value: ObservableInt): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun Double.div(value: ObservableLong): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun Double.div(value: ObservableFloat): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun Double.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: Int): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: Long): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: Float): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: Double): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: ObservableInt): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: ObservableLong): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: ObservableFloat): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableDouble.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding

public inline operator fun Double.rem(value: ObservableInt): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun Double.rem(value: ObservableLong): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun Double.rem(value: ObservableFloat): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun Double.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: Int): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: Long): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: Float): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: Double): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: ObservableInt): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: ObservableLong): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: ObservableFloat): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableDouble.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding

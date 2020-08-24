@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableFloatValue

public typealias ObservableFloat = ObservableFloatValue

public fun floatBinding(vararg dependencies: Observable, func: () -> Float): FloatBinding =
    createFloatBinding(func, *dependencies)

public fun ObservableFloat.booleanBinding(vararg dependencies: Observable, func: (Float) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloat.intBinding(vararg dependencies: Observable, func: (Float) -> Int): IntBinding =
    createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloat.longBinding(vararg dependencies: Observable, func: (Float) -> Long): LongBinding =
    createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloat.floatBinding(vararg dependencies: Observable, func: (Float) -> Float): FloatBinding =
    createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloat.doubleBinding(vararg dependencies: Observable, func: (Float) -> Double): DoubleBinding =
    createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableFloat.stringBinding(vararg dependencies: Observable, func: (Float) -> String?): StringBinding =
    createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableFloat.objectBinding(vararg dependencies: Observable, func: (Float) -> R): ObjectBinding<R> =
    createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableFloat.unaryMinus(): FloatBinding = negate(this) as FloatBinding

public inline operator fun Float.plus(value: ObservableInt): FloatBinding = add(this, value) as FloatBinding
public inline operator fun Float.plus(value: ObservableLong): FloatBinding = add(this, value) as FloatBinding
public inline operator fun Float.plus(value: ObservableFloat): FloatBinding = add(this, value) as FloatBinding
public inline operator fun Float.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableFloat.plus(value: Int): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableFloat.plus(value: Long): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableFloat.plus(value: Float): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableFloat.plus(value: Double): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableFloat.plus(value: ObservableInt): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableFloat.plus(value: ObservableLong): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableFloat.plus(value: ObservableFloat): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableFloat.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding

public inline operator fun Float.minus(value: ObservableInt): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun Float.minus(value: ObservableLong): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun Float.minus(value: ObservableFloat): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun Float.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableFloat.minus(value: Int): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableFloat.minus(value: Long): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableFloat.minus(value: Float): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableFloat.minus(value: Double): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableFloat.minus(value: ObservableInt): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableFloat.minus(value: ObservableLong): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableFloat.minus(value: ObservableFloat): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableFloat.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding

public inline operator fun Float.times(value: ObservableInt): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun Float.times(value: ObservableLong): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun Float.times(value: ObservableFloat): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun Float.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableFloat.times(value: Int): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableFloat.times(value: Long): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableFloat.times(value: Float): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableFloat.times(value: Double): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableFloat.times(value: ObservableInt): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableFloat.times(value: ObservableLong): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableFloat.times(value: ObservableFloat): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableFloat.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding

public inline operator fun Float.div(value: ObservableInt): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun Float.div(value: ObservableLong): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun Float.div(value: ObservableFloat): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun Float.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableFloat.div(value: Int): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableFloat.div(value: Long): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableFloat.div(value: Float): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableFloat.div(value: Double): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableFloat.div(value: ObservableInt): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableFloat.div(value: ObservableLong): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableFloat.div(value: ObservableFloat): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableFloat.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding

public inline operator fun Float.rem(value: ObservableInt): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun Float.rem(value: ObservableLong): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun Float.rem(value: ObservableFloat): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun Float.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableFloat.rem(value: Int): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableFloat.rem(value: Long): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableFloat.rem(value: Float): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableFloat.rem(value: Double): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableFloat.rem(value: ObservableInt): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableFloat.rem(value: ObservableLong): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableFloat.rem(value: ObservableFloat): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableFloat.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding

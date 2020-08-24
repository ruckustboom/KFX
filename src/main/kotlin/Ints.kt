@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableIntegerValue

public typealias IntBinding = IntegerBinding
public typealias ObservableInt = ObservableIntegerValue

public fun intBinding(vararg dependencies: Observable, func: () -> Int): IntBinding =
    createIntegerBinding(func, *dependencies)

public fun ObservableInt.booleanBinding(vararg dependencies: Observable, func: (Int) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableInt.intBinding(vararg dependencies: Observable, func: (Int) -> Int): IntBinding =
    createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableInt.longBinding(vararg dependencies: Observable, func: (Int) -> Long): LongBinding =
    createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableInt.floatBinding(vararg dependencies: Observable, func: (Int) -> Float): FloatBinding =
    createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableInt.doubleBinding(vararg dependencies: Observable, func: (Int) -> Double): DoubleBinding =
    createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableInt.stringBinding(vararg dependencies: Observable, func: (Int) -> String?): StringBinding =
    createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableInt.objectBinding(vararg dependencies: Observable, func: (Int) -> R): ObjectBinding<R> =
    createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableInt.unaryMinus(): IntBinding = negate(this) as IntBinding

public inline operator fun Int.plus(value: ObservableInt): IntBinding = add(this, value) as IntBinding
public inline operator fun Int.plus(value: ObservableLong): LongBinding = add(this, value) as LongBinding
public inline operator fun Int.plus(value: ObservableFloat): FloatBinding = add(this, value) as FloatBinding
public inline operator fun Int.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableInt.plus(value: Int): IntBinding = add(this, value) as IntBinding
public inline operator fun ObservableInt.plus(value: Long): LongBinding = add(this, value) as LongBinding
public inline operator fun ObservableInt.plus(value: Float): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableInt.plus(value: Double): DoubleBinding = add(this, value) as DoubleBinding
public inline operator fun ObservableInt.plus(value: ObservableInt): IntBinding = add(this, value) as IntBinding
public inline operator fun ObservableInt.plus(value: ObservableLong): LongBinding = add(this, value) as LongBinding
public inline operator fun ObservableInt.plus(value: ObservableFloat): FloatBinding = add(this, value) as FloatBinding
public inline operator fun ObservableInt.plus(value: ObservableDouble): DoubleBinding = add(this, value) as DoubleBinding

public inline operator fun Int.minus(value: ObservableInt): IntBinding = subtract(this, value) as IntBinding
public inline operator fun Int.minus(value: ObservableLong): LongBinding = subtract(this, value) as LongBinding
public inline operator fun Int.minus(value: ObservableFloat): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun Int.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableInt.minus(value: Int): IntBinding = subtract(this, value) as IntBinding
public inline operator fun ObservableInt.minus(value: Long): LongBinding = subtract(this, value) as LongBinding
public inline operator fun ObservableInt.minus(value: Float): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableInt.minus(value: Double): DoubleBinding = subtract(this, value) as DoubleBinding
public inline operator fun ObservableInt.minus(value: ObservableInt): IntBinding = subtract(this, value) as IntBinding
public inline operator fun ObservableInt.minus(value: ObservableLong): LongBinding = subtract(this, value) as LongBinding
public inline operator fun ObservableInt.minus(value: ObservableFloat): FloatBinding = subtract(this, value) as FloatBinding
public inline operator fun ObservableInt.minus(value: ObservableDouble): DoubleBinding = subtract(this, value) as DoubleBinding

public inline operator fun Int.times(value: ObservableInt): IntBinding = multiply(this, value) as IntBinding
public inline operator fun Int.times(value: ObservableLong): LongBinding = multiply(this, value) as LongBinding
public inline operator fun Int.times(value: ObservableFloat): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun Int.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableInt.times(value: Int): IntBinding = multiply(this, value) as IntBinding
public inline operator fun ObservableInt.times(value: Long): LongBinding = multiply(this, value) as LongBinding
public inline operator fun ObservableInt.times(value: Float): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableInt.times(value: Double): DoubleBinding = multiply(this, value) as DoubleBinding
public inline operator fun ObservableInt.times(value: ObservableInt): IntBinding = multiply(this, value) as IntBinding
public inline operator fun ObservableInt.times(value: ObservableLong): LongBinding = multiply(this, value) as LongBinding
public inline operator fun ObservableInt.times(value: ObservableFloat): FloatBinding = multiply(this, value) as FloatBinding
public inline operator fun ObservableInt.times(value: ObservableDouble): DoubleBinding = multiply(this, value) as DoubleBinding

public inline operator fun Int.div(value: ObservableInt): IntBinding = divide(this, value) as IntBinding
public inline operator fun Int.div(value: ObservableLong): LongBinding = divide(this, value) as LongBinding
public inline operator fun Int.div(value: ObservableFloat): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun Int.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableInt.div(value: Int): IntBinding = divide(this, value) as IntBinding
public inline operator fun ObservableInt.div(value: Long): LongBinding = divide(this, value) as LongBinding
public inline operator fun ObservableInt.div(value: Float): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableInt.div(value: Double): DoubleBinding = divide(this, value) as DoubleBinding
public inline operator fun ObservableInt.div(value: ObservableInt): IntBinding = divide(this, value) as IntBinding
public inline operator fun ObservableInt.div(value: ObservableLong): LongBinding = divide(this, value) as LongBinding
public inline operator fun ObservableInt.div(value: ObservableFloat): FloatBinding = divide(this, value) as FloatBinding
public inline operator fun ObservableInt.div(value: ObservableDouble): DoubleBinding = divide(this, value) as DoubleBinding

public inline operator fun Int.rem(value: ObservableInt): IntBinding = remainder(this, value) as IntBinding
public inline operator fun Int.rem(value: ObservableLong): LongBinding = remainder(this, value) as LongBinding
public inline operator fun Int.rem(value: ObservableFloat): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun Int.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableInt.rem(value: Int): IntBinding = remainder(this, value) as IntBinding
public inline operator fun ObservableInt.rem(value: Long): LongBinding = remainder(this, value) as LongBinding
public inline operator fun ObservableInt.rem(value: Float): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableInt.rem(value: Double): DoubleBinding = remainder(this, value) as DoubleBinding
public inline operator fun ObservableInt.rem(value: ObservableInt): IntBinding = remainder(this, value) as IntBinding
public inline operator fun ObservableInt.rem(value: ObservableLong): LongBinding = remainder(this, value) as LongBinding
public inline operator fun ObservableInt.rem(value: ObservableFloat): FloatBinding = remainder(this, value) as FloatBinding
public inline operator fun ObservableInt.rem(value: ObservableDouble): DoubleBinding = remainder(this, value) as DoubleBinding

@file:Suppress("NOTHING_TO_INLINE")

package kfx

import com.sun.javafx.binding.DoubleConstant
import com.sun.javafx.binding.FloatConstant
import com.sun.javafx.binding.IntegerConstant
import com.sun.javafx.binding.LongConstant
import javafx.beans.Observable
import javafx.beans.binding.Bindings.*
import javafx.beans.binding.NumberBinding
import javafx.beans.value.ObservableDoubleValue
import javafx.beans.value.ObservableFloatValue
import javafx.beans.value.ObservableLongValue
import javafx.beans.value.ObservableNumberValue

public inline operator fun ObservableNumberValue.unaryMinus(): NumberBinding =
    negate(this)


public inline operator fun Int.plus(value: ObservableNumberValue): NumberBinding =
    add(this, value)

public inline operator fun Long.plus(value: ObservableNumberValue): NumberBinding =
    add(this, value)

public inline operator fun Float.plus(value: ObservableNumberValue): NumberBinding =
    add(this, value)

public inline operator fun Double.plus(value: ObservableNumberValue): NumberBinding =
    add(this, value)

public inline operator fun ObservableNumberValue.plus(value: Int): NumberBinding =
    add(this, value)

public inline operator fun ObservableNumberValue.plus(value: Long): NumberBinding =
    add(this, value)

public inline operator fun ObservableNumberValue.plus(value: Float): NumberBinding =
    add(this, value)

public inline operator fun ObservableNumberValue.plus(value: Double): NumberBinding =
    add(this, value)

public inline operator fun ObservableNumberValue.plus(value: ObservableNumberValue): NumberBinding =
    add(this, value)


public inline operator fun Int.minus(value: ObservableNumberValue): NumberBinding =
    subtract(this, value)

public inline operator fun Long.minus(value: ObservableNumberValue): NumberBinding =
    subtract(this, value)

public inline operator fun Float.minus(value: ObservableNumberValue): NumberBinding =
    subtract(this, value)

public inline operator fun Double.minus(value: ObservableNumberValue): NumberBinding =
    subtract(this, value)

public inline operator fun ObservableNumberValue.minus(value: Int): NumberBinding =
    subtract(this, value)

public inline operator fun ObservableNumberValue.minus(value: Long): NumberBinding =
    subtract(this, value)

public inline operator fun ObservableNumberValue.minus(value: Float): NumberBinding =
    subtract(this, value)

public inline operator fun ObservableNumberValue.minus(value: Double): NumberBinding =
    subtract(this, value)

public inline operator fun ObservableNumberValue.minus(value: ObservableNumberValue): NumberBinding =
    subtract(this, value)


public inline operator fun Int.times(value: ObservableNumberValue): NumberBinding =
    multiply(this, value)

public inline operator fun Long.times(value: ObservableNumberValue): NumberBinding =
    multiply(this, value)

public inline operator fun Float.times(value: ObservableNumberValue): NumberBinding =
    multiply(this, value)

public inline operator fun Double.times(value: ObservableNumberValue): NumberBinding =
    multiply(this, value)

public inline operator fun ObservableNumberValue.times(value: Int): NumberBinding =
    multiply(this, value)

public inline operator fun ObservableNumberValue.times(value: Long): NumberBinding =
    multiply(this, value)

public inline operator fun ObservableNumberValue.times(value: Float): NumberBinding =
    multiply(this, value)

public inline operator fun ObservableNumberValue.times(value: Double): NumberBinding =
    multiply(this, value)

public inline operator fun ObservableNumberValue.times(value: ObservableNumberValue): NumberBinding =
    multiply(this, value)


public inline operator fun Int.div(value: ObservableNumberValue): NumberBinding =
    divide(this, value)

public inline operator fun Long.div(value: ObservableNumberValue): NumberBinding =
    divide(this, value)

public inline operator fun Float.div(value: ObservableNumberValue): NumberBinding =
    divide(this, value)

public inline operator fun Double.div(value: ObservableNumberValue): NumberBinding =
    divide(this, value)

public inline operator fun ObservableNumberValue.div(value: Int): NumberBinding =
    divide(this, value)

public inline operator fun ObservableNumberValue.div(value: Long): NumberBinding =
    divide(this, value)

public inline operator fun ObservableNumberValue.div(value: Float): NumberBinding =
    divide(this, value)

public inline operator fun ObservableNumberValue.div(value: Double): NumberBinding =
    divide(this, value)

public inline operator fun ObservableNumberValue.div(value: ObservableNumberValue): NumberBinding =
    divide(this, value)


public inline operator fun Int.rem(value: ObservableNumberValue): NumberBinding =
    remainder(this, value)

public inline operator fun Long.rem(value: ObservableNumberValue): NumberBinding =
    remainder(this, value)

public inline operator fun Float.rem(value: ObservableNumberValue): NumberBinding =
    remainder(this, value)

public inline operator fun Double.rem(value: ObservableNumberValue): NumberBinding =
    remainder(this, value)

public inline operator fun ObservableNumberValue.rem(value: Int): NumberBinding =
    remainder(this, value)

public inline operator fun ObservableNumberValue.rem(value: Long): NumberBinding =
    remainder(this, value)

public inline operator fun ObservableNumberValue.rem(value: Float): NumberBinding =
    remainder(this, value)

public inline operator fun ObservableNumberValue.rem(value: Double): NumberBinding =
    remainder(this, value)

public inline operator fun ObservableNumberValue.rem(value: ObservableNumberValue): NumberBinding =
    remainder(this, value)


// Implementation

public inline fun remainder(a: Int, b: ObservableNumberValue): NumberBinding =
    remainder(IntegerConstant.valueOf(a), b, b)

public inline fun remainder(a: Long, b: ObservableNumberValue): NumberBinding =
    remainder(LongConstant.valueOf(a), b, b)

public inline fun remainder(a: Float, b: ObservableNumberValue): NumberBinding =
    remainder(FloatConstant.valueOf(a), b, b)

public inline fun remainder(a: Double, b: ObservableNumberValue): NumberBinding =
    remainder(DoubleConstant.valueOf(a), b, b)

public inline fun remainder(a: ObservableNumberValue, b: Int): NumberBinding =
    remainder(a, IntegerConstant.valueOf(b), a)

public inline fun remainder(a: ObservableNumberValue, b: Long): NumberBinding =
    remainder(a, LongConstant.valueOf(b), a)

public inline fun remainder(a: ObservableNumberValue, b: Float): NumberBinding =
    remainder(a, FloatConstant.valueOf(b), a)

public inline fun remainder(a: ObservableNumberValue, b: Double): NumberBinding =
    remainder(a, DoubleConstant.valueOf(b), a)

public inline fun remainder(a: ObservableNumberValue, b: ObservableNumberValue): NumberBinding =
    remainder(a, b, a, b)

public fun remainder(
    a: ObservableNumberValue,
    b: ObservableNumberValue,
    vararg dependencies: Observable,
): NumberBinding = when {
    a is ObservableDoubleValue || b is ObservableDoubleValue -> doubleBinding(*dependencies) { a.doubleValue() % b.doubleValue() }
    a is ObservableFloatValue || b is ObservableFloatValue -> floatBinding(*dependencies) { a.floatValue() % b.floatValue() }
    a is ObservableLongValue || b is ObservableLongValue -> longBinding(*dependencies) { a.longValue() % b.longValue() }
    else -> intBinding(*dependencies) { a.intValue() % b.intValue() }
}

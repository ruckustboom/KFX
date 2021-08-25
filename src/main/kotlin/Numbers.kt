@file:Suppress("NOTHING_TO_INLINE")

package kfx

import com.sun.javafx.binding.DoubleConstant
import com.sun.javafx.binding.FloatConstant
import com.sun.javafx.binding.IntegerConstant
import com.sun.javafx.binding.LongConstant
import javafx.beans.Observable
import javafx.beans.binding.Bindings.*
import javafx.beans.binding.NumberBinding
import javafx.beans.value.ObservableNumberValue

public typealias ObservableNumber = ObservableNumberValue

public inline operator fun ObservableNumber.unaryMinus(): NumberBinding = negate(this)

public inline operator fun Int.plus(value: ObservableNumber): NumberBinding = add(this, value)
public inline operator fun Long.plus(value: ObservableNumber): NumberBinding = add(this, value)
public inline operator fun Float.plus(value: ObservableNumber): NumberBinding = add(this, value)
public inline operator fun Double.plus(value: ObservableNumber): NumberBinding = add(this, value)
public inline operator fun ObservableNumber.plus(value: Int): NumberBinding = add(this, value)
public inline operator fun ObservableNumber.plus(value: Long): NumberBinding = add(this, value)
public inline operator fun ObservableNumber.plus(value: Float): NumberBinding = add(this, value)
public inline operator fun ObservableNumber.plus(value: Double): NumberBinding = add(this, value)
public inline operator fun ObservableNumber.plus(value: ObservableNumber): NumberBinding = add(this, value)

public inline operator fun Int.minus(value: ObservableNumber): NumberBinding = subtract(this, value)
public inline operator fun Long.minus(value: ObservableNumber): NumberBinding = subtract(this, value)
public inline operator fun Float.minus(value: ObservableNumber): NumberBinding = subtract(this, value)
public inline operator fun Double.minus(value: ObservableNumber): NumberBinding = subtract(this, value)
public inline operator fun ObservableNumber.minus(value: Int): NumberBinding = subtract(this, value)
public inline operator fun ObservableNumber.minus(value: Long): NumberBinding = subtract(this, value)
public inline operator fun ObservableNumber.minus(value: Float): NumberBinding = subtract(this, value)
public inline operator fun ObservableNumber.minus(value: Double): NumberBinding = subtract(this, value)
public inline operator fun ObservableNumber.minus(value: ObservableNumber): NumberBinding = subtract(this, value)

public inline operator fun Int.times(value: ObservableNumber): NumberBinding = multiply(this, value)
public inline operator fun Long.times(value: ObservableNumber): NumberBinding = multiply(this, value)
public inline operator fun Float.times(value: ObservableNumber): NumberBinding = multiply(this, value)
public inline operator fun Double.times(value: ObservableNumber): NumberBinding = multiply(this, value)
public inline operator fun ObservableNumber.times(value: Int): NumberBinding = multiply(this, value)
public inline operator fun ObservableNumber.times(value: Long): NumberBinding = multiply(this, value)
public inline operator fun ObservableNumber.times(value: Float): NumberBinding = multiply(this, value)
public inline operator fun ObservableNumber.times(value: Double): NumberBinding = multiply(this, value)
public inline operator fun ObservableNumber.times(value: ObservableNumber): NumberBinding = multiply(this, value)

public inline operator fun Int.div(value: ObservableNumber): NumberBinding = divide(this, value)
public inline operator fun Long.div(value: ObservableNumber): NumberBinding = divide(this, value)
public inline operator fun Float.div(value: ObservableNumber): NumberBinding = divide(this, value)
public inline operator fun Double.div(value: ObservableNumber): NumberBinding = divide(this, value)
public inline operator fun ObservableNumber.div(value: Int): NumberBinding = divide(this, value)
public inline operator fun ObservableNumber.div(value: Long): NumberBinding = divide(this, value)
public inline operator fun ObservableNumber.div(value: Float): NumberBinding = divide(this, value)
public inline operator fun ObservableNumber.div(value: Double): NumberBinding = divide(this, value)
public inline operator fun ObservableNumber.div(value: ObservableNumber): NumberBinding = divide(this, value)

public inline operator fun Int.rem(value: ObservableNumber): NumberBinding = remainder(this, value)
public inline operator fun Long.rem(value: ObservableNumber): NumberBinding = remainder(this, value)
public inline operator fun Float.rem(value: ObservableNumber): NumberBinding = remainder(this, value)
public inline operator fun Double.rem(value: ObservableNumber): NumberBinding = remainder(this, value)
public inline operator fun ObservableNumber.rem(value: Int): NumberBinding = remainder(this, value)
public inline operator fun ObservableNumber.rem(value: Long): NumberBinding = remainder(this, value)
public inline operator fun ObservableNumber.rem(value: Float): NumberBinding = remainder(this, value)
public inline operator fun ObservableNumber.rem(value: Double): NumberBinding = remainder(this, value)
public inline operator fun ObservableNumber.rem(value: ObservableNumber): NumberBinding = remainder(this, value)

// Implementation

public inline fun remainder(a: Int, b: ObservableNumber): NumberBinding = remainder(IntegerConstant.valueOf(a), b, b)
public inline fun remainder(a: Long, b: ObservableNumber): NumberBinding = remainder(LongConstant.valueOf(a), b, b)
public inline fun remainder(a: Float, b: ObservableNumber): NumberBinding = remainder(FloatConstant.valueOf(a), b, b)
public inline fun remainder(a: Double, b: ObservableNumber): NumberBinding = remainder(DoubleConstant.valueOf(a), b, b)
public inline fun remainder(a: ObservableNumber, b: Int): NumberBinding = remainder(a, IntegerConstant.valueOf(b), a)
public inline fun remainder(a: ObservableNumber, b: Long): NumberBinding = remainder(a, LongConstant.valueOf(b), a)
public inline fun remainder(a: ObservableNumber, b: Float): NumberBinding = remainder(a, FloatConstant.valueOf(b), a)
public inline fun remainder(a: ObservableNumber, b: Double): NumberBinding = remainder(a, DoubleConstant.valueOf(b), a)
public inline fun remainder(a: ObservableNumber, b: ObservableNumber): NumberBinding = remainder(a, b, a, b)
public fun remainder(a: ObservableNumber, b: ObservableNumber, vararg dependencies: Observable): NumberBinding = when {
    a is ObservableDouble || b is ObservableDouble -> doubleBinding(*dependencies) { a.doubleValue() % b.doubleValue() }
    a is ObservableFloat || b is ObservableFloat -> floatBinding(*dependencies) { a.floatValue() % b.floatValue() }
    a is ObservableLong || b is ObservableLong -> longBinding(*dependencies) { a.longValue() % b.longValue() }
    else -> intBinding(*dependencies) { a.intValue() % b.intValue() }
}

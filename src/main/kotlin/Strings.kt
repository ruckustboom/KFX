@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.beans.Observable
import javafx.beans.binding.*
import javafx.beans.binding.Bindings.*
import javafx.beans.value.ObservableStringValue

public typealias ObservableString = ObservableStringValue

public fun stringBinding(vararg dependencies: Observable, func: () -> String?): StringBinding =
    createStringBinding(func, *dependencies)

public fun ObservableString.booleanBinding(vararg dependencies: Observable, func: (String?) -> Boolean): BooleanBinding =
    createBooleanBinding({ func(get()) }, this, *dependencies)

public fun ObservableString.intBinding(vararg dependencies: Observable, func: (String?) -> Int): IntBinding =
    createIntegerBinding({ func(get()) }, this, *dependencies)

public fun ObservableString.longBinding(vararg dependencies: Observable, func: (String?) -> Long): LongBinding =
    createLongBinding({ func(get()) }, this, *dependencies)

public fun ObservableString.floatBinding(vararg dependencies: Observable, func: (String?) -> Float): FloatBinding =
    createFloatBinding({ func(get()) }, this, *dependencies)

public fun ObservableString.doubleBinding(vararg dependencies: Observable, func: (String?) -> Double): DoubleBinding =
    createDoubleBinding({ func(get()) }, this, *dependencies)

public fun ObservableString.stringBinding(vararg dependencies: Observable, func: (String?) -> String?): StringBinding =
    createStringBinding({ func(get()) }, this, *dependencies)

public fun <R> ObservableString.objectBinding(vararg dependencies: Observable, func: (String?) -> R): ObjectBinding<R> =
    createObjectBinding({ func(get()) }, this, *dependencies)

public inline operator fun ObservableString.plus(value: Any?): StringExpression = concat(this, value)

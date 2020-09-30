@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.scene.paint.Color

public inline operator fun Color.component1(): Double = red
public inline operator fun Color.component2(): Double = green
public inline operator fun Color.component3(): Double = blue
public inline operator fun Color.component4(): Double = opacity

public fun Color.interpolatePreMultiplied(target: Color, ratio: Double): Color =
    toPreMultiplied().interpolate(target.toPreMultiplied(), ratio).toStraightAlpha()

public fun Color.toPreMultiplied(): Color = Color(red * opacity, green * opacity, blue * opacity, opacity)
public fun Color.toStraightAlpha(): Color =
    if (opacity == 0.0) Color.TRANSPARENT else Color(red / opacity, green / opacity, blue / opacity, opacity)

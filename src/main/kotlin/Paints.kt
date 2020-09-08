package kfx

import javafx.scene.paint.Color

public fun Color.interpolatePreMultiplied(target: Color, ratio: Double): Color =
    toPreMultiplied().interpolate(target.toPreMultiplied(), ratio).toStraightAlpha()

public fun Color.toPreMultiplied(): Color = Color(red * opacity, green * opacity, blue * opacity, opacity)
public fun Color.toStraightAlpha(): Color =
    if (opacity == 0.0) Color.TRANSPARENT else Color(red / opacity, green / opacity, blue / opacity, opacity)

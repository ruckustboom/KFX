package kfx.anim

import javafx.animation.*
import javafx.geometry.Point2D
import javafx.geometry.Point3D
import javafx.scene.Node
import javafx.scene.paint.Color
import javafx.scene.shape.Shape
import javafx.util.Duration

// Nodes

public inline fun Node.fade(
    duration: Duration,
    play: Boolean = true,
    setup: FadeTransition.() -> Unit = {},
): FadeTransition = FadeTransition(duration, this).prep(play, setup)

public inline fun Node.fade(
    duration: Duration,
    by: Double,
    play: Boolean = true,
    setup: FadeTransition.() -> Unit = {},
): FadeTransition = fade(duration, play) {
    byValue = by
    setup()
}

public inline fun Node.fade(
    duration: Duration,
    from: Double,
    to: Double,
    play: Boolean = true,
    setup: FadeTransition.() -> Unit = {},
): FadeTransition = fade(duration, play) {
    fromValue = from
    toValue = to
    setup()
}

public inline fun Node.translate(
    duration: Duration,
    play: Boolean = true,
    setup: TranslateTransition.() -> Unit = {},
): TranslateTransition = TranslateTransition(duration, this).prep(play, setup)

public inline fun Node.translate(
    duration: Duration,
    by: Point2D,
    play: Boolean = true,
    setup: TranslateTransition.() -> Unit = {},
): TranslateTransition = translate(duration, play) {
    byX = by.x
    byY = by.y
    setup()
}

public inline fun Node.translate(
    duration: Duration,
    from: Point2D,
    to: Point2D,
    play: Boolean = true,
    setup: TranslateTransition.() -> Unit = {},
): TranslateTransition = translate(duration, play) {
    fromX = from.x
    fromY = from.y
    toX = to.x
    toY = to.y
    setup()
}

public inline fun Node.translate(
    duration: Duration,
    by: Point3D,
    play: Boolean = true,
    setup: TranslateTransition.() -> Unit = {},
): TranslateTransition = translate(duration, play) {
    byX = by.x
    byY = by.y
    byZ = by.z
    setup()
}

public inline fun Node.translate(
    duration: Duration,
    from: Point3D,
    to: Point3D,
    play: Boolean = true,
    setup: TranslateTransition.() -> Unit = {},
): TranslateTransition = translate(duration, play) {
    fromX = from.x
    fromY = from.y
    fromZ = from.z
    toX = to.x
    toY = to.y
    toZ = to.z
    setup()
}

public inline fun Node.rotate(
    duration: Duration,
    play: Boolean = true,
    setup: RotateTransition.() -> Unit = {},
): RotateTransition = RotateTransition(duration, this).prep(play, setup)

public inline fun Node.rotate(
    duration: Duration,
    by: Double,
    play: Boolean = true,
    setup: RotateTransition.() -> Unit = {},
): RotateTransition = rotate(duration, play) {
    byAngle = by
    setup()
}

public inline fun Node.rotate(
    duration: Duration,
    from: Double,
    to: Double,
    play: Boolean = true,
    setup: RotateTransition.() -> Unit = {},
): RotateTransition = rotate(duration, play) {
    fromAngle = from
    toAngle = to
    setup()
}

public inline fun Node.scale(
    duration: Duration,
    play: Boolean = true,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = ScaleTransition(duration, this).prep(play, setup)

public inline fun Node.scale(
    duration: Duration,
    by: Double,
    play: Boolean = true,
    scaleZ: Boolean = false,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = scale(duration, play) {
    byX = by
    byY = by
    if (scaleZ) byZ = by
    setup()
}

public inline fun Node.scale(
    duration: Duration,
    by: Point2D,
    play: Boolean = true,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = scale(duration, play) {
    byX = by.x
    byY = by.y
    setup()
}

public inline fun Node.scale(
    duration: Duration,
    by: Point3D,
    play: Boolean = true,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = scale(duration, play) {
    byX = by.x
    byY = by.y
    byZ = by.z
    setup()
}

public inline fun Node.scale(
    duration: Duration,
    from: Double,
    to: Double,
    play: Boolean = true,
    scaleZ: Boolean = false,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = scale(duration, play) {
    fromX = from
    fromY = from
    toX = to
    toY = to
    if (scaleZ) {
        fromZ = from
        toZ = to
    }
    setup()
}

public inline fun Node.scale(
    duration: Duration,
    from: Point2D,
    to: Point2D,
    play: Boolean = true,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = scale(duration, play) {
    fromX = from.x
    fromY = from.y
    toX = to.x
    toY = to.y
    setup()
}

public inline fun Node.scale(
    duration: Duration,
    from: Point3D,
    to: Point3D,
    play: Boolean = true,
    setup: ScaleTransition.() -> Unit = {},
): ScaleTransition = scale(duration, play) {
    fromX = from.x
    fromY = from.y
    fromZ = from.z
    toX = to.x
    toY = to.y
    toZ = to.z
    setup()
}

public inline fun Node.path(
    duration: Duration,
    path: Shape,
    play: Boolean = true,
    setup: PathTransition.() -> Unit = {},
): PathTransition = PathTransition(duration, path, this).prep(play, setup)

// Shapes

public inline fun Shape.fill(
    duration: Duration,
    play: Boolean = true,
    setup: FillTransition.() -> Unit = {},
): FillTransition = FillTransition(duration, this).prep(play, setup)

public inline fun Shape.fill(
    duration: Duration,
    from: Color,
    to: Color,
    play: Boolean = true,
    setup: FillTransition.() -> Unit = {},
): FillTransition = fill(duration, play) {
    fromValue = from
    toValue = to
    setup()
}

public inline fun Shape.stroke(
    duration: Duration,
    play: Boolean = true,
    setup: StrokeTransition.() -> Unit = {}
): StrokeTransition = StrokeTransition(duration, this).prep(play, setup)

public inline fun Shape.stroke(
    duration: Duration,
    from: Color,
    to: Color,
    play: Boolean = true,
    setup: StrokeTransition.() -> Unit = {}
): StrokeTransition = stroke(duration, play) {
    fromValue = from
    toValue = to
    setup()
}

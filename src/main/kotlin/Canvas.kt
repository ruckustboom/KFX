package kfx

import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext

public inline fun Canvas.strokeFunction(
    x: Double = 0.0,
    y: Double = 0.0,
    w: Double = width - x,
    h: Double = height - y,
    f: (Double) -> Double,
): Unit = graphicsContext2D.strokeFunction(x, y, w, h, f)

public inline fun GraphicsContext.strokeFunction(x: Double, y: Double, w: Double, h: Double, f: (Double) -> Double) {
    var lastX = Double.NaN
    var lastY = Double.NaN
    repeat(w.toInt() + 1) { px ->
        val dx = px / w
        val dy = f(dx)
        val nextX = dx * w + x - 0.5
        val nextY = (1.0 - dy) * h + y - 0.5
        if (!lastX.isNaN() && !lastY.isNaN()) strokeLine(lastX, lastY, nextX, nextY)
        lastX = nextX
        lastY = nextY
    }
}

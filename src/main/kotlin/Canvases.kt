package kfx

import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Paint

public val GraphicsContext.width: Double get() = canvas.width
public val GraphicsContext.height: Double get() = canvas.height

public fun Canvas.clear(fill: Paint? = null): Unit = graphicsContext2D.clear(fill)
public fun GraphicsContext.clear(fill: Paint? = null) {
    clearRect(0.0, 0.0, width, height)
    if (fill != null) {
        val p = this.fill
        this.fill = fill
        fillRect(0.0, 0.0, width, height)
        this.fill = p
    }
}

public fun GraphicsContext.fillCircle(x: Double, y: Double, r: Double) {
    fillOval(x - r, y - r, 2.0 * r, 2.0 * r)
}

package kfx

import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Paint

public fun Canvas.clear(fill: Paint? = null) {
    with(graphicsContext2D) {
        clearRect(0.0, 0.0, width, height)
        if (fill != null) {
            val p = this.fill
            this.fill = fill
            graphicsContext2D.fillRect(0.0, 0.0, width, height)
            this.fill = p
        }
    }
}

public fun GraphicsContext.fillCircle(x: Double, y: Double, r: Double) {
    fillOval(x - r, y - r, 2.0 * r, 2.0 * r)
}

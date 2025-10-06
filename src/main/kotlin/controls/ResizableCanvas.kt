package kfx.controls

import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext

public open class ResizableCanvas(
    private val minWidth: Double = 0.0,
    private val minHeight: Double = 0.0
) : Canvas() {
    override fun isResizable(): Boolean = true
    override fun minWidth(height: Double): Double = minWidth
    override fun minHeight(width: Double): Double = minHeight
    override fun prefWidth(height: Double): Double = minWidth(height)
    override fun prefHeight(width: Double): Double = minHeight(width)
    override fun maxWidth(height: Double): Double = Double.POSITIVE_INFINITY
    override fun maxHeight(width: Double): Double = Double.POSITIVE_INFINITY

    override fun resize(width: Double, height: Double) {
        super.resize(width, height)
        if (!widthProperty().isBound) this.width = width
        if (!heightProperty().isBound) this.height = height
    }
}

public abstract class ProceduralCanvas(
    minWidth: Double = 0.0,
    minHeight: Double = 0.0,
) : ResizableCanvas(minWidth, minHeight) {
    public abstract fun draw()

    override fun resize(width: Double, height: Double) {
        super.resize(width, height)
        draw()
    }
}

public inline fun proceduralCanvasOf(
    minWidth: Double = 0.0,
    minHeight: Double = 0.0,
    crossinline draw: ProceduralCanvas.(GraphicsContext) -> Unit,
): ProceduralCanvas {
    return object : ProceduralCanvas(minWidth, minHeight) {
        override fun draw() = draw.invoke(this, graphicsContext2D)
    }
}

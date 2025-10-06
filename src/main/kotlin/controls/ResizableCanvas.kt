package kfx.controls

import javafx.scene.canvas.Canvas

public class ResizableCanvas(
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
        this.width = width
        this.height = height
    }
}

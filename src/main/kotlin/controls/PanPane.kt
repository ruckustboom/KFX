package kfx.controls

import javafx.beans.property.DoubleProperty
import javafx.beans.property.ReadOnlyDoubleProperty
import javafx.beans.property.ReadOnlyDoubleWrapper
import javafx.beans.property.SimpleDoubleProperty
import javafx.geometry.Point2D
import javafx.scene.Group
import javafx.scene.input.MouseButton
import javafx.scene.layout.Pane
import javafx.scene.transform.Scale
import kotlin.math.abs

// TODO: Add properties for zoom bounds
public class PanPane : Pane() {
    public val content: Group = Group()

    public val panXProperty: DoubleProperty = SimpleDoubleProperty(this, "panX", 0.0)
    public var panX: Double
        get() = panXProperty.get()
        set(value) = panXProperty.set(value)

    public val panYProperty: DoubleProperty = SimpleDoubleProperty(this, "panY", 0.0)
    public var panY: Double
        get() = panYProperty.get()
        set(value) = panYProperty.set(value)

    private val _zoomProperty = ReadOnlyDoubleWrapper(this, "zoom", 1.0)
    public val zoomProperty: ReadOnlyDoubleProperty get() = _zoomProperty.readOnlyProperty
    public val zoom: Double get() = zoomProperty.get()

    private val zoomScale = Scale()

    init {
        content.isManaged = false
        content.layoutXProperty().bind(panXProperty)
        content.layoutYProperty().bind(panYProperty)
        zoomScale.xProperty().bind(zoomProperty)
        zoomScale.yProperty().bind(zoomProperty)
        content.transforms += zoomScale

        children += content
    }

    public fun zoomTo(pivot: Point2D, scale: Double) {
        panX -= (scale - zoom) * pivot.x
        panY -= (scale - zoom) * pivot.y
        _zoomProperty.set(scale)
    }

    public fun zoomIn(pivot: Point2D, delta: Double = DEFAULT_ZOOM_DELTA): Unit =
        zoomTo(pivot, zoom * delta)

    public fun zoomOut(pivot: Point2D, delta: Double = DEFAULT_ZOOM_DELTA): Unit =
        zoomTo(pivot, zoom / delta)

    // Some helpful methods to convert between coordinate spaces on the transformed pane

    public fun sceneToOffset(scene: Point2D): Point2D = sceneToOffset(scene.x, scene.y)
    public fun sceneToOffset(sceneX: Double, sceneY: Double): Point2D {
        val bounds = boundsInParent
        return Point2D(
            (sceneX - bounds.minX - panX) / zoom,
            (sceneY - bounds.minY - panY) / zoom,
        )
    }

    public fun offsetToScene(offset: Point2D): Point2D = offsetToScene(offset.x, offset.y)
    public fun offsetToScene(offsetX: Double, offsetY: Double): Point2D {
        val bounds = boundsInParent
        return Point2D(
            offsetX * zoom + panX + bounds.minX,
            offsetY * zoom + panY + bounds.minY,
        )
    }

    public companion object {
        public const val DEFAULT_ZOOM_DELTA: Double = 1.1
    }
}

public fun PanPane.setupSimpleMouseControls(
    panButton: MouseButton = MouseButton.PRIMARY,
    scrollScale: Double = 40.0,
) {
    var isDragging = false
    var x = 0.0
    var y = 0.0

    setOnMousePressed {
        if (it.button == panButton) {
            x = panX - it.sceneX
            y = panY - it.sceneY
            isDragging = true
            it.consume()
        }
    }

    setOnMouseDragged {
        if (isDragging && it.button == panButton) {
            panX = x + it.sceneX
            panY = y + it.sceneY
            it.consume()
        }
    }

    setOnMouseReleased {
        if (isDragging && it.button == panButton) {
            isDragging = false
            it.consume()
        }
    }

    setOnScroll {
        if (it.deltaY != 0.0) {
            val offset = sceneToOffset(it.sceneX, it.sceneY)
            val delta = abs(it.deltaY) / scrollScale * PanPane.DEFAULT_ZOOM_DELTA
            if (it.deltaY > 0.0) zoomIn(offset, delta)
            else if (it.deltaY < 0.0) zoomOut(offset, delta)
            it.consume()
        }
    }
}

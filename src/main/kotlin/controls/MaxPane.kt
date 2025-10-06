package kfx.controls

import javafx.beans.property.BooleanProperty
import javafx.beans.property.SimpleBooleanProperty
import javafx.scene.Node
import javafx.scene.canvas.Canvas
import javafx.scene.layout.Pane

public class MaxPane : Pane {
    public constructor() : super()
    public constructor(vararg children: Node) : super(*children)

    public val ignoreInsetsProperty: BooleanProperty = SimpleBooleanProperty(this, "ignoreInsets", false)
    public var isIgnoreInsets: Boolean
        get() = ignoreInsetsProperty.get()
        set(value) = ignoreInsetsProperty.set(value)

    init {
        ignoreInsetsProperty.addListener {
            if (children.isNotEmpty()) {
                requestLayout()
            }
        }
    }

    override fun layoutChildren() {
        var x = 0.0
        var y = 0.0
        var w = width
        var h = height
        if (!isIgnoreInsets) {
            x = snappedLeftInset()
            y = snappedTopInset()
            w = snapSizeX(width) - x - snappedRightInset()
            h = snapSizeY(height) - y - snappedBottomInset()
        }

        for (child in children) {
            if (!child.isManaged) continue
            if (child.isResizable) {
                child.resizeRelocate(x, y, w, h)
            } else {
                // TODO: Use content layout policy to handle positioning non-resizable children
                if (child is Canvas) {
                    child.width = w
                    child.height = h
                }
                child.relocate(x, y)
            }
        }
    }
}

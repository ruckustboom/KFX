@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.scene.layout.Region
import javafx.scene.shape.Rectangle

public inline fun Region.clipToBounds() {
    clip = Rectangle().also {
        it.widthProperty().bind(widthProperty())
        it.heightProperty().bind(heightProperty())
    }
}

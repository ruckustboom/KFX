@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.scene.Node
import javafx.scene.layout.Region
import javafx.scene.shape.Rectangle

public inline fun Region.clipToBounds() {
    clip = Rectangle().also {
        it.widthProperty().bind(widthProperty())
        it.heightProperty().bind(heightProperty())
    }
}

public inline fun Node.hasProperty(key: Any?): Boolean = hasProperties() && key in properties
public inline fun Node.getProperty(key: Any?): Any? = if (hasProperties()) properties[key] else null
public inline fun Node.removeProperty(key: Any?): Any? = if (hasProperties()) properties.remove(key) else null

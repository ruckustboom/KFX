@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.scene.Node
import javafx.scene.Parent
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

/**
 * Returns the deepest node at ([sceneX], [sceneY]) that matches the conditions
 *
 * **IMPORTANT:** [sceneX] and [sceneY] should be the **root** scene coordinates
 *
 * _Original code from [Jonathan Giles](http://fxexperience.com/2016/01/node-picking-in-javafx/)_
 */
public fun Node.pick(
    sceneX: Double, sceneY: Double,
    ignoreMouseTransparent: Boolean = true,
    ignoreInvisible: Boolean = true,
    ignoreUnmanaged: Boolean = false,
    ignoreDisabled: Boolean = false,
    isValid: (Node.() -> Boolean)? = null,
): Node? {
    if (
        (!isVisible && ignoreInvisible) ||
        (isMouseTransparent && ignoreMouseTransparent) ||
        (!isManaged && ignoreUnmanaged) ||
        (isDisabled && ignoreDisabled) ||
        sceneToLocal(sceneX, sceneY) !in this ||
        (isValid != null && !isValid())
    ) return null
    if (this is Parent) {
        for (child in childrenUnmodifiable) {
            return child?.pick(
                sceneX, sceneY,
                ignoreMouseTransparent,
                ignoreInvisible,
                ignoreUnmanaged,
                ignoreDisabled,
                isValid,
            ) ?: continue
        }
    }
    return this
}

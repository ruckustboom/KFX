@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.css.PseudoClass
import javafx.scene.Node

public inline fun PseudoClass(pseudoClass: String): PseudoClass = PseudoClass.getPseudoClass(pseudoClass)

public inline operator fun Node.get(pseudoClass: PseudoClass): Boolean = pseudoClass in pseudoClassStates
public inline operator fun Node.set(pseudoClass: PseudoClass, state: Boolean): Unit =
    pseudoClassStateChanged(pseudoClass, state)

public inline infix fun Node.toggle(pseudoClass: PseudoClass) {
    this[pseudoClass] = !this[pseudoClass]
}

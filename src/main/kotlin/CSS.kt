@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.css.PseudoClass

public inline fun PseudoClass(pseudoClass: String): PseudoClass = PseudoClass.getPseudoClass(pseudoClass)

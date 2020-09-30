@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.geometry.Point2D
import javafx.geometry.Point3D

public inline operator fun Point2D.component1(): Double = x
public inline operator fun Point2D.component2(): Double = y

public inline operator fun Point3D.component1(): Double = x
public inline operator fun Point3D.component2(): Double = y
public inline operator fun Point3D.component3(): Double = z

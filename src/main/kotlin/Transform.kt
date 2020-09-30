@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.geometry.Bounds
import javafx.geometry.Point2D
import javafx.geometry.Point3D
import javafx.scene.transform.*

public inline operator fun Transform.invoke(x: Double, y: Double): Point2D = transform(x, y)
public inline operator fun Transform.invoke(x: Double, y: Double, z: Double): Point3D = transform(x, y, z)
public inline operator fun Transform.invoke(bounds: Bounds): Bounds = transform(bounds)
public inline operator fun Transform.invoke(point: Point2D): Point2D = transform(point)
public inline operator fun Transform.invoke(point: Point3D): Point3D = transform(point)

public inline operator fun Affine.component1(): Double = mxx
public inline operator fun Affine.component2(): Double = mxy
public inline operator fun Affine.component3(): Double = mxz
public inline operator fun Affine.component4(): Double = tx
public inline operator fun Affine.component5(): Double = myx
public inline operator fun Affine.component6(): Double = myy
public inline operator fun Affine.component7(): Double = myz
public inline operator fun Affine.component8(): Double = ty
public inline operator fun Affine.component9(): Double = mzx
public inline operator fun Affine.component10(): Double = mzy
public inline operator fun Affine.component11(): Double = mzz
public inline operator fun Affine.component12(): Double = tz

public inline operator fun Rotate.component1(): Double = angle
public inline operator fun Rotate.component2(): Point3D = axis
public inline operator fun Rotate.component3(): Double = pivotX
public inline operator fun Rotate.component4(): Double = pivotY
public inline operator fun Rotate.component5(): Double = pivotZ

public inline operator fun Scale.component1(): Double = x
public inline operator fun Scale.component2(): Double = y
public inline operator fun Scale.component3(): Double = z
public inline operator fun Scale.component4(): Double = pivotX
public inline operator fun Scale.component5(): Double = pivotY
public inline operator fun Scale.component6(): Double = pivotZ

public inline operator fun Shear.component1(): Double = x
public inline operator fun Shear.component2(): Double = y
public inline operator fun Shear.component3(): Double = pivotX
public inline operator fun Shear.component4(): Double = pivotY

public inline operator fun Translate.component1(): Double = x
public inline operator fun Translate.component2(): Double = y
public inline operator fun Translate.component3(): Double = z

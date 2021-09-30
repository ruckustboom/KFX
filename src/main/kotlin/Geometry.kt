@file:Suppress("NOTHING_TO_INLINE")

package kfx

import javafx.geometry.Point2D
import javafx.geometry.Point3D

public inline operator fun Point2D.component1(): Double = x
public inline operator fun Point2D.component2(): Double = y

public inline operator fun Point3D.component1(): Double = x
public inline operator fun Point3D.component2(): Double = y
public inline operator fun Point3D.component3(): Double = z

public inline operator fun Point2D.plus(point: Point2D): Point2D = add(point)
public inline operator fun Point2D.minus(point: Point2D): Point2D = subtract(point)
public inline operator fun Point2D.times(factor: Double): Point2D = multiply(factor)
public inline operator fun Point2D.div(factor: Double): Point2D = Point2D(x / factor, y / factor)
public inline operator fun Point2D.rem(factor: Double): Point2D = Point2D(x % factor, y % factor)
public inline fun Point2D.mod(factor: Double): Point2D = Point2D(x.mod(factor), y.mod(factor))

public inline operator fun Point3D.plus(point: Point3D): Point3D = add(point)
public inline operator fun Point3D.minus(point: Point3D): Point3D = subtract(point)
public inline operator fun Point3D.times(factor: Double): Point3D = multiply(factor)
public inline operator fun Point3D.div(factor: Double): Point3D = Point3D(x / factor, y / factor, z / factor)
public inline operator fun Point3D.rem(factor: Double): Point3D = Point3D(x % factor, y % factor, z % factor)
public inline fun Point3D.mod(factor: Double): Point3D = Point3D(x.mod(factor), y.mod(factor), z.mod(factor))
public inline infix fun Point3D.cross(vector: Point3D): Point3D = crossProduct(vector)
public inline infix fun Point3D.dot(vector: Point3D): Double = dotProduct(vector)

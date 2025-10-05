package kfx.anim

import javafx.animation.Interpolator
import javafx.animation.KeyFrame
import javafx.animation.KeyValue
import javafx.animation.Timeline
import javafx.beans.value.WritableValue
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.util.Duration

public inline fun timeline(
    vararg keyFrames: KeyFrame,
    play: Boolean = true,
    setup: Timeline.() -> Unit = {},
): Timeline = Timeline(*keyFrames).prep(play, setup)

public inline fun keyFrame(
    time: Duration,
    vararg values: KeyValue,
    name: String? = null,
    onFinished: EventHandler<ActionEvent>? = null,
    setup: KeyFrame.() -> Unit = {},
): KeyFrame {
    val frame = KeyFrame(time, name, onFinished, *values)
    frame.setup()
    return frame
}

public inline fun keyFrame(
    time: Duration,
    values: Collection<KeyValue>,
    name: String? = null,
    onFinished: EventHandler<ActionEvent>? = null,
    setup: KeyFrame.() -> Unit = {},
): KeyFrame {
    val frame = KeyFrame(time, name, onFinished, values)
    frame.setup()
    return frame
}

public infix fun <T> WritableValue<T>.keyVal(to: T): KeyValue = KeyValue(this, to)
public fun <T> WritableValue<T>.keyVal(to: T, interpolator: Interpolator): KeyValue =
    KeyValue(this, to, interpolator)

package kfx.anim

import javafx.animation.Animation
import javafx.animation.Interpolator
import javafx.animation.KeyFrame
import javafx.animation.KeyValue
import javafx.animation.ParallelTransition
import javafx.animation.PauseTransition
import javafx.animation.SequentialTransition
import javafx.animation.Timeline
import javafx.beans.value.WritableValue
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.util.Duration

public inline fun <A : Animation> A.prep(play: Boolean = true, setup: A.() -> Unit): A {
    setup()
    if (play) play()
    return this
}

public inline fun pause(
    duration: Duration,
    play: Boolean = true,
    setup: PauseTransition.() -> Unit = {},
): PauseTransition = PauseTransition(duration).prep(play, setup)

public inline fun sequential(
    vararg animations: Animation,
    play: Boolean = true,
    setup: SequentialTransition.() -> Unit = {},
): SequentialTransition = SequentialTransition(*animations).prep(play, setup)

public inline fun parallel(
    vararg animations: Animation,
    play: Boolean = true,
    setup: ParallelTransition.() -> Unit = {},
): ParallelTransition = ParallelTransition(*animations).prep(play, setup)

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

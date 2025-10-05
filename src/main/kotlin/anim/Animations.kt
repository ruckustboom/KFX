package kfx.anim

import javafx.animation.Animation
import javafx.animation.AnimationTimer
import javafx.animation.ParallelTransition
import javafx.animation.PauseTransition
import javafx.animation.SequentialTransition
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

public inline fun onEveryFrame(
    start: Boolean = true,
    deltaTime: Boolean = false,
    crossinline action: (time: Long) -> Unit
): AnimationTimer {
    val timer = if (deltaTime) object : DeltaAnimationTimer() {
        override fun handleDelta(delta: Long) = action(delta)
    } else object : AnimationTimer() {
        override fun handle(now: Long) = action(now)
    }
    if (start) timer.start()
    return timer
}

public abstract class DeltaAnimationTimer : AnimationTimer() {
    private var then = 0L

    public abstract fun handleDelta(delta: Long)

    override fun start() {
        super.start()
        then = System.nanoTime()
    }

    override fun handle(now: Long) {
        val delta = now - then
        then = now
        handleDelta(delta)
    }
}

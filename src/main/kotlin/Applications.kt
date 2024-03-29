package kfx

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

public inline fun <reified T : Application> launch(vararg args: String) {
    Application.launch(T::class.java, *args)
}

public open class SimpleFXMLApplication(
    private val fxml: String,
    private val title: String? = null,
    private val stylesheets: List<String> = emptyList()
) : Application() {
    override fun start(primaryStage: Stage) {
        if (title != null) primaryStage.title = title
        val scene = Scene(FXMLLoader.load(javaClass.getResource(fxml)))
        scene.stylesheets.addAll(stylesheets)
        primaryStage.scene = scene
        primaryStage.show()
    }
}

public inline fun onEveryFrame(start: Boolean = true, crossinline action: (now: Long) -> Unit): AnimationTimer {
    val timer = object : AnimationTimer() {
        override fun handle(now: Long) = action(now)
    }
    if (start) timer.start()
    return timer
}

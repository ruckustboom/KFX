package kfx.apps

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Line
import javafx.scene.shape.StrokeLineCap
import javafx.scene.text.Font
import javafx.stage.Stage
import kfx.controls.MaxPane
import kfx.controls.PanPane
import kfx.controls.setupSimpleMouseControls
import kfx.launch

fun main() = launch<PanTestApp>()
class PanTestApp : Application() {
    private val panPane = PanPane()

    override fun start(primaryStage: Stage) {
        panPane.background = Background(BackgroundFill(Color.DODGERBLUE, null, null))

        repeat(10) { x ->
            repeat(10) { y ->
                panPane.content.children += Circle(x * 50.0, y * 50.0, 2.0)
                panPane.content.children += Label("$x, $y").apply {
                    font = Font(18.0)
                    translateX = x * 50.0
                    translateY = y * 50.0
                }
            }
        }

        panPane.content.children += Line(0.0, -5.0, 0.0, 5.0).apply {
            stroke = Color.RED
            strokeWidth = 2.0
            strokeLineCap = StrokeLineCap.ROUND
        }
        panPane.content.children += Line(-5.0, 0.0, 5.0, 0.0).apply {
            stroke = Color.RED
            strokeWidth = 2.0
            strokeLineCap = StrokeLineCap.ROUND
        }

        primaryStage.title = "Pan Test"
        primaryStage.scene = Scene(MaxPane(panPane), 960.0, 540.0)
        primaryStage.show()

        panPane.setupSimpleMouseControls()
    }
}

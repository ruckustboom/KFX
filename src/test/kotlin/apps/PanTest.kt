package kfx.apps

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Line
import javafx.scene.shape.StrokeLineCap
import javafx.scene.text.Font
import javafx.stage.Stage
import kfx.clear
import kfx.controls.*
import kfx.launch
import kotlin.math.ceil

fun main() = launch<PanTestApp>()
class PanTestApp : Application() {
    private val panPane = PanPane()
    private val proceduralGrid = proceduralCanvasOf { gc ->
        clear(Color.DODGERBLUE)

        val scale = GRID_SIZE * panPane.zoom
        var d = panPane.panX.mod(scale)
        repeat(ceil(width / scale).toInt()) {
            gc.stroke = Color.LIME
            gc.strokeLine(d, 0.0, d, height)
            d += scale
        }
        d = panPane.panY.mod(scale)
        repeat(ceil(height / scale).toInt()) {
            gc.stroke = Color.LIME
            gc.strokeLine(0.0, d, width, d)
            d += scale
        }
    }

    override fun start(primaryStage: Stage) {
        panPane.panXProperty.addListener { proceduralGrid.draw() }
        panPane.panYProperty.addListener { proceduralGrid.draw() }
        panPane.zoomProperty.addListener { proceduralGrid.draw() }

        repeat(10) { x ->
            repeat(10) { y ->
                panPane.content.children += Circle(x * GRID_SIZE, y * GRID_SIZE, 2.0)
                panPane.content.children += Label("$x, $y").apply {
                    font = Font(18.0)
                    translateX = x * GRID_SIZE
                    translateY = y * GRID_SIZE
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
        primaryStage.scene = Scene(MaxPane(proceduralGrid, panPane), 960.0, 540.0)
        primaryStage.show()

        panPane.setupSimpleMouseControls()
    }

    companion object {
        private const val GRID_SIZE = 50.0
    }
}

package kfx.apps

import javafx.animation.Animation
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.geometry.Point2D
import javafx.scene.control.ChoiceBox
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Rectangle
import javafx.util.Duration
import kfx.SimpleFXMLApplication
import kfx.anim.*
import kfx.launch
import java.net.URL
import java.util.*

fun main() = launch<AnimationTestsApp>()
class AnimationTestsApp : SimpleFXMLApplication("/animation-tests.fxml", "Animation Tests")

class AnimationTests : Initializable {
    @FXML private lateinit var animationSelector: ChoiceBox<Anim>

    @FXML private lateinit var shape: Rectangle

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        val fade = shape.fade(
            duration = Duration.seconds(0.5),
            from = 0.5,
            to = 1.0,
            play = false
        )
        val translate = shape.translate(
            duration = Duration.seconds(0.5),
            from = Point2D(0.0, 0.0),
            to = Point2D(50.0, 100.0),
            play = false
        )
        val rotate = shape.rotate(
            duration = Duration.seconds(0.5),
            from = 0.0,
            to = 45.0,
            play = false
        )
        val scale = shape.scale(
            duration = Duration.seconds(0.5),
            from = 1.0,
            to = 2.0,
            play = false
        )
        val path = shape.path(
            duration = Duration.seconds(0.5),
            path = Circle(100.0),
            play = false
        )
        val fill = shape.fill(
            duration = Duration.seconds(0.5),
            from = Color.ORANGE,
            to = Color.BLUE,
            play = false,
        )
        val stroke = shape.stroke(
            duration = Duration.seconds(0.5),
            from = Color.GREEN,
            to = Color.RED,
            play = false,
        )
        animationSelector.items.addAll(
            Anim("Path", path),
            Anim("Sequence", sequential(fade, translate, rotate, scale, fill, stroke, play = false)),
            Anim("Parallel", parallel(fade, translate, rotate, scale, fill, stroke, play = false)),
        )
    }

    @FXML private fun animate() {
        animationSelector.value?.anim?.play()
        animationSelector.selectionModel.select(null)
    }

    private class Anim(val title: String, val anim: Animation) {
        override fun toString() = title
    }
}

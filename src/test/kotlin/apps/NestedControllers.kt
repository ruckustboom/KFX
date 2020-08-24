package kfx.apps

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.paint.Color
import kfx.*
import java.net.URL
import java.time.LocalTime
import java.util.*

fun main() = launch<NestedControllersApp>()
class NestedControllersApp : SimpleFXMLApplication("/nested-controllers.fxml", "Nested Controllers")

class NestedControllers : Initializable {
    @FXML
    private lateinit var centerController: Placeholder

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        centerController.message.text = "center"

        onEveryFrame {
            val time = LocalTime.now()
            centerController.message.text = LocalTime.of(time.hour, time.minute).toString()

            val delta = time.second + time.nano / 1e9
            centerController.message.textFill = Color.hsb(delta * 6, 1.0, 1.0)
        }
    }
}

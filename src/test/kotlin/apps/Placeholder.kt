package kfx.apps

import javafx.fxml.FXML
import javafx.scene.control.Label

class Placeholder {
    @FXML
    private lateinit var label: Label
    val message get() = label
}

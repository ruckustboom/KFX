package kfx.apps

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TreeCell
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeView
import javafx.scene.paint.Color
import javafx.scene.shape.Rectangle
import kfx.*
import ruckustboom.palette.*
import java.net.URL
import java.util.*

fun main() = launch<PalettesApp>()
class PalettesApp : SimpleFXMLApplication("/palettes.fxml", "Palettes")

class Palettes : Initializable {
    @FXML
    private lateinit var colorTree: TreeView<Pair<String, Color?>>

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        colorTree.isShowRoot = false
        val root = TreeItem<Pair<String, Color?>>("PALETTES" to null)
        colorTree.root = root
        colorTree.setCellFactory { ColorTreeCell() }

        root.children += Bootstrap.toTree().convert()
        root.children += ElementaryOS.toTree().convert()
        root.children += Firefox.toTree().convert()
        root.children += Gnome2.toTree().convert()
        root.children += Gnome3.toTree().convert()
        root.children += iOS.toTree().convert()
        root.children += Material.toTree().convert()
        root.children += Nord.toTree().convert()
        root.children += Ubuntu.toTree().convert()
    }

    private fun Tree<Pair<String, String?>>.convert(): TreeItem<Pair<String, Color?>> {
        val root = TreeItem(value.first to value.second?.toColor())
        for (child in children) root.children += child.convert()
        return root
    }

    private fun String.toColor(): Color = Color.web(this)
}

private class ColorTreeCell : TreeCell<Pair<String, Color?>>() {
    override fun updateItem(item: Pair<String, Color?>?, empty: Boolean) {
        super.updateItem(item, empty)
        if (empty || item == null) {
            text = null
            graphic = null
        } else {
            text = item.first
            graphic = item.second?.toRectangle()
        }
    }

    private fun Color.toRectangle() = Rectangle(10.0, 10.0, this)
        .apply { stroke = Color.gray(0.5) }
}

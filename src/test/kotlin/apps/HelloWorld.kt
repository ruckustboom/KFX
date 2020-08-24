package kfx.apps

import kfx.*

fun main() = launch<HelloWorldApp>()
class HelloWorldApp : SimpleFXMLApplication("/hello-world.fxml")

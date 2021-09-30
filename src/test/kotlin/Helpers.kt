package kfx

import javafx.beans.property.*

class TestWrapper<T>(value: T) {
    @get:JvmName("valueProperty")
    val valueProperty: ObjectProperty<T> = SimpleObjectProperty(this, "value", value)
    var value by valueProperty
}

class TestData(string: String, int: Int) {
    @get:JvmName("stringProperty")
    val stringProperty: StringProperty = SimpleStringProperty(this, "string", string)
    var string by stringProperty

    @get:JvmName("intProperty")
    val intProperty: IntegerProperty = SimpleIntegerProperty(this, "int", int)
    var int by intProperty
}

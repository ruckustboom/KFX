package kfx

import javafx.beans.property.SimpleObjectProperty
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class SelectBindingTest {
    @Test
    fun testSelection() {
        val property = SimpleObjectProperty(TestWrapper(TestData("a", 1)))
        val string = property.selectString("value", "string")
        val int = property.selectInt("value", "int")

        assertEquals("a", string.get())
        assertEquals(1, int.get())

        property.get().value.string = "b"
        assertEquals("b", string.get())

        property.get().value = TestData("c", 2)
        assertEquals("c", string.get())
        assertEquals(2, int.get())

        property.get().value.int = 3
        assertEquals(3, int.get())

        property.set(TestWrapper(TestData("d", 4)))
        assertEquals("d", string.get())
        assertEquals(4, int.get())

        property.set(null)
        assertNull(string.get())
        assertEquals(0, int.get())
    }

    @Test
    fun testDeep() {
        val deep = SimpleObjectProperty(TestWrapper(TestWrapper(TestWrapper(TestWrapper(TestWrapper("a"))))))
        val value = deep.selectString("value", "value", "value", "value", "value")

        assertEquals("a", value.get())

        deep.get().value.value.value.value.value = "b"
        assertEquals("b", value.get())

        deep.get().value.value = TestWrapper(TestWrapper(TestWrapper("c")))
        assertEquals("c", value.get())

        deep.get().value.value.value = null
        assertNull(value.get())

        deep.set(TestWrapper(TestWrapper(TestWrapper(TestWrapper(TestWrapper("d"))))))
        assertEquals("d", value.get())

        deep.get().value.value.value.value.value = null
        assertNull(value.get())
    }
}

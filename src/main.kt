import java.awt.EventQueue
import javax.swing.*

class Main(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(800, 500)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {

    val frame = Main("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}
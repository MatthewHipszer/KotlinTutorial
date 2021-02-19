import java.awt.Color
import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.*
import javax.swing.SwingConstants.LEADING
import kotlin.system.exitProcess

class Main(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        val colorArray = arrayOf<Color>(Color.black, Color.blue, Color.cyan,
            Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta,
            Color.orange, Color.pink, Color.red, Color.white, Color.yellow)

        val labels = colorArray.map {
            JLabel("", null, LEADING).apply {
                minimumSize = Dimension(90, 40)
                background = it
                isOpaque = true
            }
        }

        val closeButton = JButton("Close").apply {
            minimumSize = Dimension(90, 40)
            isOpaque = true
        }
        closeButton.addActionListener { exitProcess(0) }

        createLayout(labels, closeButton)

        setTitle(title)

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(800, 500)
        setLocationRelativeTo(null)
    }

    private fun createLayout(labels: List<JLabel>, vararg arg: JComponent) {

        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.autoCreateContainerGaps = true
        gl.autoCreateGaps = true

        gl.setHorizontalGroup(gl.createParallelGroup()
            .addGroup(gl.createSequentialGroup()
                .addComponent(labels[0])
                .addComponent(labels[1])
                .addComponent(labels[2])
                .addComponent(labels[3]))
            .addGroup(gl.createSequentialGroup()
                .addComponent(labels[4])
                .addComponent(labels[5])
                .addComponent(labels[6])
                .addComponent(labels[7])
                .addComponent(labels[8])
                .addComponent(labels[9])
                .addComponent(labels[10])
                .addComponent(labels[11]))
            .addComponent(labels[12])
            .addComponent(arg[0])
        )

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGroup(gl.createParallelGroup()
                .addComponent(labels[0])
                .addComponent(labels[1])
                .addComponent(labels[2])
                .addComponent(labels[3]))
            .addGroup(gl.createParallelGroup()
                .addComponent(labels[4])
                .addComponent(labels[5])
                .addComponent(labels[6])
                .addComponent(labels[7])
                .addComponent(labels[8])
                .addComponent(labels[9])
                .addComponent(labels[10])
                .addComponent(labels[11]))
            .addComponent(labels[12])
            .addComponent(arg[0])
        )

        pack()
    }
}

private fun createAndShowGUI() {

    val frame = Main("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.Data
import screen.mapScreen
import model.ControlModel
import model.DoteModel
import view.menuView

@Composable
@Preview
fun App(size : Int) {
    Data.size = size
    val map = Array(size) { Array(size) { DoteModel() } }
    map.forEach { row ->
        row.forEach {
            it1 -> it1.init(false)
        }
    }

    val control = ControlModel()
    control.init(pause_ = true, oneStat_ = false)

    val buffer = Array(size) { Array(size) { false } }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        menuView(control)
        mapScreen(map, buffer, control)
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "a Live") {
        App(32)
    }
}

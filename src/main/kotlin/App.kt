import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import data.Data
import model.ControlModel
import model.DoteModel
import screen.mapScreen
import view.menuView


@Composable
@Preview
@Suppress("FunctionNaming")
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

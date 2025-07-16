package org.dev

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import data.Data
import model.ControlModel
import model.DoteModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import screen.mapScreen
import view.menuView


@Composable
@Preview
fun App(size: Int = 32) {
    MaterialTheme {
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
}

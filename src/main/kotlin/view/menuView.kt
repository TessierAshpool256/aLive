package view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.ControlModel

@Composable
fun menuView(controlModel: ControlModel) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth(),
    ) {
            Button(
                modifier = Modifier.padding(5.dp),
                onClick = {
                controlModel.pause.value = !controlModel.pause.value
            }, content = {
                    Text(
                        if (controlModel.pause.value)
                            "> Снять с паузы"
                        else
                            "|| Поставить на паузу"
                    )
                }
            )

            Button(
                modifier = Modifier.padding(5.dp),
                onClick = {
                    controlModel.oneStep.value = !controlModel.oneStep.value
                    controlModel.pause.value = false
                },
                content = {
                    Text("Сделать один шаг")
                }
            )
        }
}
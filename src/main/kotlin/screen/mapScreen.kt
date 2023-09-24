package screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import manager.ProcessingManager
import model.ControlModel
import model.DoteModel
import utile.copyM
import view.doteView

@Composable
fun mapScreen(map: Array<Array<DoteModel>>, buffer:  Array<Array<Boolean>>, control: ControlModel) {
    if ( !(control.pause.value || control.oneStep.value) ) {
        ProcessingManager.processing(map, buffer)
        copyM(map, buffer)
    }

    Card(
        modifier = Modifier
            .padding(top = 10.dp),
        elevation = 35.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            for (x in map.indices)
                Column {
                    for (y in map[1].indices)
                        doteView(map[x][y])
                }
        }
    }

    if ( control.oneStep.value )
        control.oneStep.value = !control.oneStep.value
}
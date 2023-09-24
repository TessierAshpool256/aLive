package view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import model.DoteModel

@Composable
fun doteView(doteModel: DoteModel) {
    val color = if ( doteModel.dote.value ) Color.Green else Color.White
    Box(
        modifier = Modifier
            .background(color = color)
            .size(15.dp)
            .clickable {
                doteModel.invert()
            }
    )
}
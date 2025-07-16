package model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


class DoteModel {
    lateinit var dote : MutableState<Boolean>

    @Composable
    fun init( f : Boolean ) {
        dote = mutableStateOf(f)
    }

    fun setDote(value : Boolean) {
        if ( value != dote.value ) dote.value = value
    }

    fun invert() {
        dote.value = !dote.value
    }
}

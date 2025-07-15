package model

import androidx.compose.runtime.*


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

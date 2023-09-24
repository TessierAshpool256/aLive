package model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class ControlModel {
    lateinit var pause   : MutableState<Boolean>
    lateinit var oneStep : MutableState<Boolean>

    @Composable
    fun init(
        pause_    : Boolean,
        oneStat_  : Boolean
    ) {
        pause   = mutableStateOf(pause_)
        oneStep = mutableStateOf(oneStat_)
    }
}
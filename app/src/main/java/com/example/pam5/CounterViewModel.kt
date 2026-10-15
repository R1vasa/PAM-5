package com.example.pam5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class CounterViewModel : ViewModel() {
    var counter by mutableStateOf(0)
        private set

    fun increase(){
        counter++
    }

    fun decrease(){
        counter--
    }

    fun reset(){
        counter = 0
    }
}
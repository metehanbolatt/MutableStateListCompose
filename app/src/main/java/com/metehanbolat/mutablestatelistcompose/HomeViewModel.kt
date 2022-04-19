package com.metehanbolat.mutablestatelistcompose

import android.annotation.SuppressLint
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlin.random.Random

@SuppressLint("MutableCollectionMutableState")
class HomeViewModel: ViewModel() {

    // private val _elementss: MutableState<MutableList<Int>> = mutableStateOf(mutableListOf())
    // val elements: State<List<Int>> = _elements

    /*
    fun addElement() {
        val randomNumber = Random.nextInt(from = 1, until = 100)
        _elements.value.add(randomNumber)
    }
     */

    private val _elements = mutableStateListOf<Int>()
    val elements: List<Int> =_elements

    fun addElement() {
        val randomNumber = Random.nextInt(from = 1, until = 100)
        _elements.add(randomNumber)
    }
}
package com.example.lv4_vorgic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :  ViewModel(){

    private val _countA = MutableLiveData<Int>(0)
    private val _countB = MutableLiveData<Int>(0)

    val countA: LiveData<Int> = _countA
    val countB: LiveData<Int> = _countB

    fun addOneA() {
        _countA.value=(_countA.value ?: 0) + 1
    }

    fun addTwoA() {
        _countA.value=(_countA.value ?: 0) + 2
    }

    fun addThreeA() {
        _countA.value=(_countA.value ?: 0) + 3
    }

    fun addOneB() {
        _countB.value=(_countB.value ?: 0) + 1
    }

    fun addTwoB() {
        _countB.value=(_countB.value ?: 0) + 2
    }

    fun addThreeB() {
        _countB.value=(_countB.value ?: 0) + 3
    }

    fun reset(){
        _countA.value = 0
        _countB.value = 0
    }


}
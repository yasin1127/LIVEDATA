package com.example.livedata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CVM: ViewModel() {
    private val c=MutableLiveData<Int>()
    val co : LiveData<Int> = c
            init{
                c.value=0
            }

    fun incrementC(){
      c.value=co.value?.plus(1)
    }
    fun decrementC(){
        c.value=co.value?.minus(1)
    }
    fun resetC(){
        c.value=0
    }
}
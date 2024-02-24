package com.bensboyz.food.ui.distribution

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DistributionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is distribution Fragment"
    }
    val text: LiveData<String> = _text
}
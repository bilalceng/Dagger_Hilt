package com.bilalberekgm.daggerhilt.viewmodel

import androidx.lifecycle.ViewModel
import com.bilalberekgm.daggerhilt.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    //With lazy tag you will able to create the repository when you first create it instance otherwise it will not used.
    private val repository: Lazy<MyRepository>
): ViewModel(){
    init {
        repository.get() //Thanks to lazy (in dagger/hilt) you will use repository firstly here.
    }
}
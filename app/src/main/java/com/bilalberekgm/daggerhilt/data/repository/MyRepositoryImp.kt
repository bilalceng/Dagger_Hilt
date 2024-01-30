package com.bilalberekgm.daggerhilt.data.repository

import android.app.Application
import android.util.Log
import com.bilalberekgm.daggerhilt.data.remote.MyApi
import com.bilalberekgm.daggerhilt.domain.repository.MyRepository
import com.bilalberekgm.daggerhilt.utils.String1
import javax.inject.Inject

class MyRepositoryImp @Inject constructor(
    val api: MyApi,
    val application: Application,
    @String1 val string: String
): MyRepository {

    init {
        Log.d("StringController", string)
    }
    override fun doNetworkCall() {

    }
}
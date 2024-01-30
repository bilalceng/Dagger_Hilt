package com.bilalberekgm.daggerhilt.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.bilalberekgm.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service(){
    //We have to make field injection because service constructor can not take parameters.
    @Inject
    lateinit var myRepository: MyRepository

    override fun onCreate() {
        super.onCreate()
        myRepository.doNetworkCall()
    }


    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}
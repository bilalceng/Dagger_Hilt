package com.bilalberekgm.daggerhilt.di

import android.app.Application
import com.bilalberekgm.daggerhilt.data.remote.MyApi
import com.bilalberekgm.daggerhilt.data.repository.MyRepositoryImp
import com.bilalberekgm.daggerhilt.domain.repository.MyRepository
import com.bilalberekgm.daggerhilt.utils.String1
import com.bilalberekgm.daggerhilt.utils.String2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi():MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com.tr")
            .build()
            .create(MyApi::class.java)
    }

    /**
     *
     *     @Provides
     *     @Singleton
     *     fun provideMyRepository(api: MyApi, app:Application, @String1 string1: String):MyRepository{
     *         return MyRepositoryImp(api,app,string1)
     *     }
     *
     */


    @Provides
    @Singleton
    @String1
    fun provideString1() = "string1"


    @Provides
    @Singleton
    @String2
    fun provideString2() = "string2"

}
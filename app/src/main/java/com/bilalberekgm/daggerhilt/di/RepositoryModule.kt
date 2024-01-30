package com.bilalberekgm.daggerhilt.di

import com.bilalberekgm.daggerhilt.data.repository.MyRepositoryImp
import com.bilalberekgm.daggerhilt.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(repositoryImp: MyRepositoryImp): MyRepository
}
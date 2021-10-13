package com.werockstar.git_kmm.android.di

import com.werockstar.git_kmm.data.remote.GitLoader
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    @Singleton
    fun provideLoader(): GitLoader = GitLoader()
}
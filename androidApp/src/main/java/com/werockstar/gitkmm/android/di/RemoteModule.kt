package com.werockstar.gitkmm.android.di

import com.werockstar.gitkmm.data.remote.GitLoader
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

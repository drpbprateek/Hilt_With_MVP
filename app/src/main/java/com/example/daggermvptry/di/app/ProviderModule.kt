package com.example.daggermvptry.di.app

import com.example.daggermvptry.providers.pearls.PearlRepository
import com.example.daggermvptry.providers.pearls.PearlRepositoryImpl
import com.example.daggermvptry.providers.tests.TestsRepository
import com.example.daggermvptry.providers.tests.TestsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ProviderModule {

    @Provides
    fun providePearlRepo(repo: PearlRepositoryImpl): PearlRepository = repo

    @Singleton
    @Provides
    fun provideTestRepo(repo: TestsRepositoryImpl): TestsRepository = repo

}
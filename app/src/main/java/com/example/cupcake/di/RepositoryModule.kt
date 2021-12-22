package com.example.cupcake.di

import com.example.cupcake.domain.FlavorsRepository
import com.example.cupcake.infraestructure.FlavorsInMemory
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindFlavorsRepository(inMemoryRepository: FlavorsInMemory) : FlavorsRepository
}
package com.dumbbellpro.android.di

import android.content.Context
import androidx.room.Room
import com.dumbbellpro.android.data.local.AppDatabase
import com.dumbbellpro.android.data.repository.ExerciseRepository
import com.dumbbellpro.android.data.repository.ExerciseRepositoryImpl
import com.dumbbellpro.android.data.repository.WorkoutRepository
import com.dumbbellpro.android.data.repository.WorkoutRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "dumbbellpro_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideExerciseRepository(
        appDatabase: AppDatabase
    ): ExerciseRepository {
        return ExerciseRepositoryImpl(appDatabase.exerciseDao())
    }

    @Provides
    @Singleton
    fun provideWorkoutRepository(
        appDatabase: AppDatabase
    ): WorkoutRepository {
        return WorkoutRepositoryImpl(appDatabase.workoutDao())
    }
}
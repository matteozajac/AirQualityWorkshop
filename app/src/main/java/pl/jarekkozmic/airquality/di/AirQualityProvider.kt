package pl.jarekkozmic.airquality.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pl.jarekkozmic.airquality.logic.FakeRemoteStationsRepository
import pl.jarekkozmic.airquality.logic.RemoteStationsRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AirQualityProvider {

    @Provides
    @Singleton
    fun provideRemoteStationsRepository(): RemoteStationsRepository {
        return FakeRemoteStationsRepository()
    }

}
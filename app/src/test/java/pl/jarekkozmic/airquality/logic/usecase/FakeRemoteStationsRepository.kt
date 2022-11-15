package pl.jarekkozmic.airquality.logic.usecase

import pl.jarekkozmic.airquality.entity.AQStation
import pl.jarekkozmic.airquality.logic.repository.RemoteStationsRepository
import javax.inject.Singleton

class FakeRemoteStationsRepository: RemoteStationsRepository {
    override suspend fun getAll(): List<AQStation> {
        return emptyList()
    }

}
package pl.jarekkozmic.airquality.data.local

import pl.jarekkozmic.airquality.entity.AQStation
import pl.jarekkozmic.airquality.logic.repository.LocalStationsRepository

class InMemoryStationsRepository: LocalStationsRepository {
    override suspend fun getAll(): List<AQStation> {
        return emptyList()
    }

    override suspend fun save(stations: List<AQStation>) {

    }
}
package pl.jarekkozmic.airquality.logic

import pl.jarekkozmic.airquality.entity.AQStation
import javax.inject.Inject

class GetStationsUseCase @Inject constructor() {

    fun execute(): List<AQStation> {
        return listOf(AQStation("123", "Name", "Kraków", "Sponsor", null))
    }
}
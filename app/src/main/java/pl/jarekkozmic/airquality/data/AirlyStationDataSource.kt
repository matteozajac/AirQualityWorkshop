package pl.jarekkozmic.airquality.data

import pl.jarekkozmic.airquality.entity.AQStation
import pl.jarekkozmic.airquality.logic.RemoteStationsRepository
import retrofit2.http.GET

class AirlyStationDataSource : RemoteStationsRepository {
    override suspend fun getAll(): List<AQStation> {

    }

    interface AirlyService {
        @GET("installations/nearest?lat=50.062006&lng=19.940984&maxDistanceKM=5&maxResults=100")
        suspend fun getInstallations(): List<Installation>
    }

    data class Installation()
}
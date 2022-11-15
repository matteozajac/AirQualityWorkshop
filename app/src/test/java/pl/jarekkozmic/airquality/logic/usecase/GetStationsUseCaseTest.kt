package pl.jarekkozmic.airquality.logic.usecase

import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import pl.jarekkozmic.airquality.entity.AQStation
import pl.jarekkozmic.airquality.logic.repository.RemoteStationsRepository


class GetStationsUseCaseTest {

    @Test
    fun init_DoesNotMakeAnyRemoteOrLocalCalls() {
        val remote = MockRemoteStationsRepository()
        val sut = GetStationsUseCase(remoteStationsRepository = remote)
        assertEquals(false, remote.getAllCalled)
    }

    @Test
    fun executeMakesOneCallToRemote() = runBlocking {
        val remote = MockRemoteStationsRepository()
        val sut = GetStationsUseCase(remoteStationsRepository = remote)
        sut.execute()
        assertEquals(1, remote.getAllCallsCount)
    }

}

class MockRemoteStationsRepository : RemoteStationsRepository{
    val getAllCalled: Boolean
        get() = getAllCallsCount > 0
    var getAllCallsCount: Int = 0

    override suspend fun getAll(): List<AQStation> {
        getAllCallsCount++
        return listOf()
    }
}
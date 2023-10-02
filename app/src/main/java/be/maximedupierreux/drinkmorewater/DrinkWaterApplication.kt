package be.maximedupierreux.drinkmorewater

import android.app.Application
import be.maximedupierreux.drinkmorewater.data.HealthConnectManager


class DrinkWaterApplication: Application() {
    val healthConnectManager by lazy {
        HealthConnectManager(this)
    }
}
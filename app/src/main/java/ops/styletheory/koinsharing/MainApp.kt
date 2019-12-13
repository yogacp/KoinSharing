package ops.styletheory.koinsharing

import android.app.Application
import ops.styletheory.koinsharing.module.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Yoga C. Pranata on 2019-12-13.
 * Android Engineer
 */
class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApp)
            modules(appComponent)
        }
    }

}
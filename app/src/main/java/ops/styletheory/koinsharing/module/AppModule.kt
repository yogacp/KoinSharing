package ops.styletheory.koinsharing.module

import ops.styletheory.koinsharing.utils.Cappucino
import ops.styletheory.koinsharing.utils.Espresso
import ops.styletheory.koinsharing.utils.Kopi
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Created by Yoga C. Pranata on 2019-12-13.
 * Android Engineer
 */
val appModule = module {
    single { Espresso(androidContext(), "Air putih") }
}

val kopiModule = module {
    single { Kopi(get()) }
}

val cappucinoModule = module {
    factory { Cappucino(get(), get()) }
}
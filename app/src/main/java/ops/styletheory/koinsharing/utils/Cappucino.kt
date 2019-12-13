package ops.styletheory.koinsharing.utils

/**
 * Created by Yoga C. Pranata on 2019-12-13.
 * Android Engineer
 */
class Cappucino (val kopi: Kopi, val espresso: Espresso) {

    fun setCappucino(data: String) = "${getCappucino()} + $data"

    fun getCappucino() = kopi.getKopiEspresso().getInputText() + "-" + espresso.getInputText() + "- Cappucino"

}
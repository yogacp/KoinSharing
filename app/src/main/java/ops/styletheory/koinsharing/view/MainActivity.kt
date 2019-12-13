package ops.styletheory.koinsharing.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ops.styletheory.koinsharing.R
import ops.styletheory.koinsharing.utils.Cappucino
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val cappucino: Cappucino by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtView.text = cappucino.getCappucino()
        txtView2.text = cappucino.setCappucino("Mas Willi")
    }
}

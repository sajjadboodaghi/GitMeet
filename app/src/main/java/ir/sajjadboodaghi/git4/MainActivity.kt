package ir.sajjadboodaghi.git4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showAlert(view: View) {
        Toast
            .makeText(this, "you tapped there", Toast.LENGTH_SHORT)
            .show()
    }
}

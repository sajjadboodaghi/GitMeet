package ir.sajjadboodaghi.git4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val nameEdit: EditText = findViewById(R.id.name_edit)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayHello(view: View) {
        Toast.makeText(this, "hello {nameEdit.getText().toString()", Toast.LENGTH_SHORT)
             .show()
    }

    fun sayBye(view: View) {
        val name =
        Toast.makeText(this, "bye {nameEdit.getText().toString()}", Toast.LENGTH_SHORT)
            .show()
    }
}

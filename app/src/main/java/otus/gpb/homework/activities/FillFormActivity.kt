package otus.gpb.homework.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FillFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_form)

        val editTextName = findViewById<EditText>(R.id.edittext_name)
        val editTextSurname = findViewById<EditText>(R.id.edittext_surname)
        val editTextAge = findViewById<EditText>(R.id.edittext_age)

        findViewById<Button>(R.id.button_apply).setOnClickListener {
            val data = Intent().apply {
                putExtra(EditProfileActivity.NAME, editTextName.text.toString())
                putExtra(EditProfileActivity.SURNAME, editTextSurname.text.toString())
                putExtra(EditProfileActivity.AGE, editTextAge.text.toString())
            }

            setResult(Activity.RESULT_OK, data)
            finish()

        }
    }

}
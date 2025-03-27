package za.co.varsitycollege.st10468512.mealsuggestion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val inputTime = findViewById<EditText>(R.id.inputTime)
        val buttonSuggestionmeal =findViewById<Button>(R.id.buttonSuggestmeal)
        val TextView2 = findViewById<TextView>(R.id.TextView2)
        btnReset?.setOnClickListener {
            inputTime.text.clear()
        }

        buttonSuggestionmeal?.setOnClickListener {

            //when the text is correct the button reacts
            when {
                //responds for correct the button text
                inputTime.text.toString() == "Morning" -> TextView2.text ="eggs and toast with juice"

                inputTime.text.toString() == "Afteroon" -> TextView2.text ="burger and chips with cooldrink"
                inputTime.text.toString() == "Mid Afteroon" -> TextView2.text ="smoothie"
                inputTime.text.toString() == "Dinner" -> TextView2.text ="Pasta and salad"
                //incorrect text response
                else -> Toast.makeText(this, "Incorrect input " , Toast.LENGTH_LONG).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
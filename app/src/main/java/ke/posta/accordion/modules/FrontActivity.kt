package ke.posta.accordion.modules

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ke.posta.accordion.R
import soup.neumorphism.NeumorphButton

class FrontActivity : AppCompatActivity() {
    private lateinit var neumorphButton: NeumorphButton;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

//        neumorphButton = findViewById(R.id.button)
//
//        neumorphButton.setOnClickListener {
//            Log.d(TAG, "onCreate: pressed")
//        }
    }
}
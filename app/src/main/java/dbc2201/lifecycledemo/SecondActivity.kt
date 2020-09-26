package dbc2201.lifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageTextView = findViewById<TextView>(R.id.messageTextView)

        val messageFromMainActivity: String = intent.getStringExtra("message").toString()

        messageTextView.text = messageFromMainActivity

        val mainActivityButton = findViewById<Button>(R.id.buttonMainActivity)

        val thirdActivityButton: Button =
            findViewById<Button>(R.id.thirdActivityButton)
        thirdActivityButton.apply {
            setOnClickListener {
                val thirdActivityIntent = Intent(
                    this@SecondActivity,
                    ThirdActivity::class.java
                )
                startActivity(thirdActivityIntent)
            }
        }
    }

    fun goToMainActivity(view: View) {
        val mainActivityIntent = Intent(
            this@SecondActivity,
            MainActivity::class.java
        )
        startActivity(mainActivityIntent)
    }
}
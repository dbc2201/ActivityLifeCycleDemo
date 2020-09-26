package dbc2201.lifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1 : Reference the UI button in this Kotlin class.
        val nextButton = findViewById<Button>(R.id.button_next)
    }

    fun goToSecondActivity(view: View) {
        val secondActivityIntent: Intent = Intent(
            this@MainActivity,
            SecondActivity::class.java
        ).apply {
            putExtra("message", "Hello, from the MainActivity")
        }
        startActivity(secondActivityIntent)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            this@MainActivity,
            "onStart() function was called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this@MainActivity,
            "onResume() function was called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            this@MainActivity,
            "onPause() function was called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this@MainActivity,
            "onStop() function was called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(
            this@MainActivity,
            "onDestroy() function was called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(
            this@MainActivity,
            "onRestart() function was called",
            Toast.LENGTH_SHORT
        ).show()
    }
}





















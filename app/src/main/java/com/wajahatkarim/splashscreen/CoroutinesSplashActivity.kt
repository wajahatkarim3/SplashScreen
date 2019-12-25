package com.wajahatkarim.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class CoroutinesSplashActivity : AppCompatActivity() {

    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_splash)

        activityScope.launch {
            delay(3000)

            var intent = Intent(this@CoroutinesSplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}
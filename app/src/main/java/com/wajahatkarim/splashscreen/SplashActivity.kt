package com.wajahatkarim.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        activityScope.launch {
            delay(3000)
            launchHomeScreen()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }

    fun launchHomeScreen()
    {
        var intent = Intent(this@SplashActivity, HomeActivity::class.java)
        startActivity(intent)
    }
}

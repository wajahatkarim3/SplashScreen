package com.wajahatkarim.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class CoroutinesSplashActivity : AppCompatActivity() {

    private lateinit var activityScope: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_splash)
        activityScope = splashState()
    }

    override fun onResume() {
        super.onResume()
        if (activityScope.isActive.not())
            splashState()
    }

    override fun onPause() {
        super.onPause()
        activityScope.cancel()
    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }

    private fun splashState() = CoroutineScope(Dispatchers.Main).launch {
        delay(3000)
        val intent = Intent(this@CoroutinesSplashActivity, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
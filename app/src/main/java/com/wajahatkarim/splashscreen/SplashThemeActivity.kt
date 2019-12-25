package com.wajahatkarim.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashThemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_theme)
    }
}
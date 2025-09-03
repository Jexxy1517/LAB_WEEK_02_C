package com.example.lab_week_02_c

import android.app.ComponentCaller
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_week_02_c.R

class SingleTopActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)
        Log.d(DEBUG, "onCreate")

        findViewById<Button>(R.id.button_single_top).setOnClickListener {
            startActivity(
                Intent(this, SingleTopActivity::class.java)
            )
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }
}
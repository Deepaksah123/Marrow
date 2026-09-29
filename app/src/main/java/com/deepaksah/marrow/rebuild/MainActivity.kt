package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Native project foundation.
 * Screen implementations are added only from verified APK/decompiler evidence.
 */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "Marrow Rebuild"
            textSize = 24f
            setPadding(32, 32, 32, 32)
        })
    }
}

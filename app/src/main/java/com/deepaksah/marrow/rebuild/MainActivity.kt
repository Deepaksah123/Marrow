package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : Activity() {
    private lateinit var content: LinearLayout
    private val subjects = listOf(
        "Anatomy","Anaesthesia","Biochemistry","Community Medicine","Dermatology",
        "ENT","Forensic Medicine","Medicine","Microbiology","Obstetrics & Gynaecology",
        "Ophthalmology","Orthopaedics","Paediatrics","Pathology","Pharmacology",
        "Physiology","Psychiatry","Radiology","Surgery"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        content = findViewById(R.id.content)

        findViewById<TextView>(R.id.navHome).setOnClickListener { showHome() }
        findViewById<TextView>(R.id.navQBank).setOnClickListener { showQBank() }
        findViewById<TextView>(R.id.navTests).setOnClickListener { showPlaceholder("Tests") }
        findViewById<TextView>(R.id.navVideos).setOnClickListener { showPlaceholder("Videos") }

        showHome()
    }

    private fun showHome() {
        content.removeAllViews()
        val view = LayoutInflater.from(this).inflate(R.layout.screen_home, content, false)
        content.addView(view)
    }

    private fun showQBank() {
        content.removeAllViews()
        val view = LayoutInflater.from(this).inflate(R.layout.screen_qbank, content, false)
        content.addView(view)

        val container = view.findViewById<LinearLayout>(R.id.subjectContainer)
        subjects.forEach { subject ->
            val row = TextView(this).apply {
                text = subject
                textSize = 16f
                setPadding(20, 20, 20, 20)
                setBackgroundColor(0xFFFFFFFF.toInt())
            }
            container.addView(row)
        }
    }

    private fun showPlaceholder(title: String) {
        content.removeAllViews()
        content.addView(TextView(this).apply {
            text = title
            textSize = 26f
            setPadding(32, 32, 32, 32)
        })
    }
}

package com.example.bazel

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("Bazel", "Hello, Android")
        setContentView(R.layout.activity_main)
        val clickMeButton: Button = findViewById(R.id.clickMeButton)
        val helloBazelTextView: TextView = findViewById(R.id.helloBazelTextView)
        val greeter = Greeter()

        // Bazel supports Java 8 language features like lambdas!
        clickMeButton.setOnClickListener { v -> helloBazelTextView.setText(greeter.sayHello()) }
    }
}
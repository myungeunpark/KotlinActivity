package com.example.kotlinactivity

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent = getIntent()
        textView4.text = intent.getStringExtra("name")
        textView4.append("\n" + intent.getStringExtra("age"))
        textView4.append("\n" + intent.getStringExtra("school"))
        textView4.append("\n" + intent.getStringExtra("score"))

        setResult(Activity.RESULT_OK, intent)
    }
}

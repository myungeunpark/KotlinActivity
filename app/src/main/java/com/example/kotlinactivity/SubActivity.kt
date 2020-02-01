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
        nameText.text = "name : " + intent.getStringExtra("name")
        ageText.text =  "age : " + intent.getIntExtra("age", 0)
        schoolText.text = "school : " + intent.getStringExtra("school")
        scoreText.text = "score : " + intent.getIntExtra("score", 0)

        image.setImageResource(intent.getIntExtra("source", 0))
        setResult(Activity.RESULT_OK, intent)
    }
}

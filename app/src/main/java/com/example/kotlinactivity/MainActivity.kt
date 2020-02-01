package com.example.kotlinactivity


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("name", "James Moon")
            intent.putExtra("age", 20)
            intent.putExtra("school", "Fallon Middle School")
            intent.putExtra("score", 100)
            startActivityForResult(intent, 100)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 100 && resultCode == Activity.RESULT_OK){

            textView.text = data?.getStringExtra("name")
            textView.append("\n + ${data?.getIntExtra("age", 0)}")
            textView.append("\n + ${data?.getStringExtra("school")}")
            textView.append("\n + ${data?.getIntExtra("score", 0)}")
        }
    }
}

package com.example.kotlinactivity


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("name", "James Moon")
            intent.putExtra("age", 12)
            intent.putExtra("school", "Fallon Middle School")
            intent.putExtra("score", 100)
            intent.putExtra("source", R.drawable.face1)
            startActivityForResult(intent, REQUEST_CODE)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){

            textView1.text = "Profile Summary"
            textView2.text = " + name - " + data?.getStringExtra("name")
            textView2.append("\n + age - ${data?.getIntExtra("age", 0)}")
            textView2.append("\n + school - ${data?.getStringExtra("school")}")
            textView2.append("\n + score - ${data?.getIntExtra("score", 0)}")
        }
    }
}

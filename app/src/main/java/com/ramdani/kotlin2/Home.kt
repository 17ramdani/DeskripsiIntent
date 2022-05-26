package com.ramdani.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView

class Home: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val imageView1 =
            findViewById<ImageView>(R.id.imageView1)
        val imageView2 =
            findViewById<ImageView>(R.id.imageView2)
        val imageView3 =
            findViewById<ImageView>(R.id.imageView3)
        val imageView4 =
            findViewById<ImageView>(R.id.imageView4)

        imageView1.setOnClickListener {
            val detailIntent = Intent(this,
                MainActivity::class.java)
            startActivity(detailIntent)
        }
        imageView2.setOnClickListener {
            val detailIntent = Intent(this,
                MainActivity2::class.java)
            startActivity(detailIntent)
        }
        imageView3.setOnClickListener {
            val detailIntent = Intent(this,
                MainActivity3::class.java)
            startActivity(detailIntent)
        }
        imageView4.setOnClickListener {
            val detailIntent = Intent(this,
                MainActivity4::class.java)
            startActivity(detailIntent)
        }
    }
}

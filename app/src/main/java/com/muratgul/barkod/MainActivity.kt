package com.muratgul.barkod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, EkstreActivity::class.java)
            startActivity(intent)
        }

        textBarcode.addTextChangedListener {
            Toast.makeText(this, textBarcode.text, Toast.LENGTH_SHORT).show()
        }


    }

    override fun onResume() {
        super.onResume()
        textBarcode.setText(intent.getStringExtra("barkod"))


    }






}
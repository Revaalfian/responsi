package com.example.responsi191

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val nim = bundle?.get("nim")

        nama2.text=nama.toString()
        nim2.text=nim.toString()

            }
}

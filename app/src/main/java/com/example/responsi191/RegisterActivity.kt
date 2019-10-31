package com.example.responsi191

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_account.nim
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_sel.setOnClickListener {
            intent = Intent (this,AccountActivity::class.java)
            intent.putExtra("nama", nama.text)
            intent.putExtra("nim", nim.text)
            startActivity(intent)
        }
    }
}

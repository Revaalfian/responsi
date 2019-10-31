package com.example.responsi191

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listView= findViewById(R.id.listView)
        var list = mutableListOf<model>()

        list.add(model("ban",   "ini ban;",   R.drawable.ban  ))
        list.add(model("baut",   "ini baut",   R.drawable.baut  ))
        list.add(model("busi", "cpu", R.drawable.busi  ))
        list.add(model("jok",  "jok",  R.drawable.jok   ))
        list.add(model("knalpot",  "knalpot",  R.drawable.knalpot  ))
        list.add(model("led",  "LED",  R.drawable.led ))
        list.add(model("mur",  "mur",  R.drawable.mur  ))
        list.add(model("spion",  "spion",  R.drawable.spion  ))
        list.add(model("stang",  "stang",  R.drawable.stang  ))
        list.add(model("velg",  "velg",  R.drawable.velg  ))

        listView.adapter = adapter(this,R.layout.item,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@HomeActivity, "satu buah motor memiliki 2 buah ban",   Toast.LENGTH_LONG).show() }
            if (position==1){
                Toast.makeText(this@HomeActivity, "baut terbuat dari besi",   Toast.LENGTH_LONG).show() }
            if (position==2){
                Toast.makeText(this@HomeActivity, "busi berfungsi sebagai pengapian sebuah motor", Toast.LENGTH_LONG).show() }
            if (position==3){
                Toast.makeText(this@HomeActivity, "jok berfungsi sebagai tempat duduk motor",  Toast.LENGTH_LONG).show() }
            if (position==4){
                Toast.makeText(this@HomeActivity, "knalpot berfungsi sebagai filter gas buang dari mesin",  Toast.LENGTH_LONG).show() }
            if (position==5){
                Toast.makeText(this@HomeActivity, "led atau lampu sebagai penerangan dijalan",  Toast.LENGTH_LONG).show() }
            if (position==6){
                Toast.makeText(this@HomeActivity, "mur komponen terpentig dari sebuah motor",  Toast.LENGTH_LONG).show() }
            if (position==7){
                Toast.makeText(this@HomeActivity, "spion sebagai membantu melihat kebelakang",  Toast.LENGTH_LONG).show() }
            if (position==8){
                Toast.makeText(this@HomeActivity, "stang sebagai pegangfan motor",  Toast.LENGTH_LONG).show() }
            if (position==9){
                Toast.makeText(this@HomeActivity, "velg sebagai pendamping ban",  Toast.LENGTH_LONG).show() }

        }

        btn_acon.setOnClickListener(){
            intent = Intent (this,AccountActivity::class.java)
            startActivity(intent)}
    }
}

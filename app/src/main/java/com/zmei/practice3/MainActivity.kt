package com.zmei.practice3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.practice3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 101 && resultCode == RESULT_OK && data != null) {
        bindingClass.textView2.text = data.getStringExtra("key2")
        }
    }

    fun onClickSecond(view: View){

    val i = Intent(this, SecondActivity::class.java)
        i.putExtra("key", "How is your name")
        startActivityForResult(i, 101)


    }
}
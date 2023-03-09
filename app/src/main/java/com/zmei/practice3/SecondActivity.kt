package com.zmei.practice3

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zmei.practice3.databinding.ActivityMainBinding
import com.zmei.practice3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.textView.text = message
    }

        fun onClickBack(view: View) {

        intent.putExtra("key2", bindingClass.editText2.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
                                                        }








package com.example.demoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import android.util.TypedValue
import androidx.core.widget.TextViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,TextWatcher{



    override fun afterTextChanged(s: Editable?) {
        txtView.text = txtTypeSomething.text
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


    }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            txtTypeSomething.addTextChangedListener(this)

            TextViewCompat.setAutoSizeTextTypeWithDefaults(txtView,TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM)


        }

}

package com.sahabatdeveloper.belajarkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvNama: TextView? = null
    var etNama: EditText? = null
    var btnShowNama: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNama = findViewById<View>(R.id.tv_tampil_nama) as TextView?
        etNama = findViewById<View>(R.id.et_nama) as EditText?
        btnShowNama = findViewById<View>(R.id.btn_tampil) as Button?

        btnShowNama!!.setOnClickListener {
            tvNama!!.text = etNama!!.text;
        }
    }
}

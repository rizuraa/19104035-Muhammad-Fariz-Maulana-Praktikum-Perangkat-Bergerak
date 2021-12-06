package com.fariz_maulana_19104035.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityReadData : AppCompatActivity() {

    private lateinit var lblProdiSaya : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_read_data)

        lblProdiSaya = findViewById(R.id.lblProdiSaya)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
}

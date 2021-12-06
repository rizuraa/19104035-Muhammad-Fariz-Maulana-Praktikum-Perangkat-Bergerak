package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        printAndShowState("Halaman satu onStart")
    }

    override fun onResume() {
        super.onResume()
        printAndShowState("Halaman satu onResume")
    }

    override fun onRestart() {
        super.onRestart()
        printAndShowState("Halaman satu onRestart")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printAndShowState("Halaman satu onCreate")

        var button_to_halaman2: Button = findViewById(R.id.button_to_halaman2)

        button_to_halaman2.setOnClickListener{
            startActivity(Intent(this, Halaman2Activity::class.java))
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        printAndShowState("Halaman satu onPause")
    }

    override fun onStop() {
        super.onStop()
        printAndShowState("Halaman satu onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printAndShowState("Halaman satu onDestroy")
    }

    fun printAndShowState(messege: String){
        Log.i("Lifecycler State ", messege)
        Toast.makeText(this, "Lifecycle State : " +messege, Toast.LENGTH_SHORT).show()
    }
}
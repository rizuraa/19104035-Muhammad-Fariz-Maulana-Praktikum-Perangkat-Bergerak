package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Halaman2Activity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        printAndShowState("Halaman dua onStart")
    }

    override fun onResume() {
        super.onResume()
        printAndShowState("Halaman dua onResume")
    }

    override fun onRestart() {
        super.onRestart()
        printAndShowState("Halaman dua onRestart")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)
        printAndShowState("Halaman dua onCreate")

        var button_to_halaman1: Button = findViewById(R.id.button_to_halaman1)

        button_to_halaman1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        printAndShowState("Halaman dua onPause")
    }

    override fun onStop() {
        super.onStop()
        printAndShowState("Halaman dua onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printAndShowState("Halaman dua onDestroy")
    }

    fun printAndShowState(messege: String){
        Log.i("Lifecycler State ", messege)
        Toast.makeText(this, "Lifecycle State : " +messege, Toast.LENGTH_SHORT).show()
    }
}
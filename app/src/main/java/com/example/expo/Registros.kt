package com.example.expo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expo.ui.registroscompletos.Registroscompletos

class Registros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registros)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, Registroscompletos.newInstance())
//                .commitNow()
//        }
    }
}
package com.dicoding.testingapplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.lang.StringBuilder
import kotlin.math.max
import kotlin.random.Random



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textHello = findViewById<TextView>(R.id.tv_helloworld)


        val kucing = Animal("Meooow", 6.0, 2, true)
        textHello.text = kucing.getAnimalInfo
        val animalInfo = kucing.getAnimalInfo
        Log.d("test1", "cek $animalInfo")
    }

}

class Animal(
    var name: String,
    var weight: Double,
    var age: Int,
    var isMamalia: Boolean
)

val Animal.getAnimalInfo: String
    get() = "Nama $name, Berat : $weight Kilo Gram, umur: $age Tahun, dan Mamalian: $isMamalia"
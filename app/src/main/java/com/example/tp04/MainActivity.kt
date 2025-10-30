package com.example.tp04

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView)
        val fruitsList = listOf(
            Fruits("Orange", 47, R.drawable.orange),
            Fruits("Apple", 52, R.drawable.apple),
            Fruits("Kiwi", 33, R.drawable.kiwi),
            Fruits("Banana", 89, R.drawable.banana)
        )
        val adapter = FruitAdapter(this, fruitsList)
        listView.adapter = adapter

        // 🔹 Add click listener to each item
        listView.setOnItemClickListener { parent, view, position, id ->
            val clickedFruit = fruitsList[position]
            Toast.makeText(
                this,
                "${clickedFruit.nom} - ${clickedFruit.nombreDeCalories} calories",
                Toast.LENGTH_SHORT
            ).show()  // Show message at bottom
        }
    }
}

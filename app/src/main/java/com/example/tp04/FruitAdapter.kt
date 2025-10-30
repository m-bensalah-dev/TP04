package com.example.tp04
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
class FruitAdapter(private val context: Context, private val fruits: List<Fruits>) : BaseAdapter() {
    override fun getCount(): Int = fruits.size

    override fun getItem(position: Int): Any = fruits[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.one_fruit, parent, false)
        val fruit = fruits[position]

        val imageView = view.findViewById<ImageView>(R.id.fruitImage)
        val nameView = view.findViewById<TextView>(R.id.fruitName)
        val caloriesView = view.findViewById<TextView>(R.id.fruitCalories)

        imageView.setImageResource(fruit.image)
        nameView.text = fruit.nom
        caloriesView.text = "Calories: ${fruit.nombreDeCalories}"

        return view
    }
}

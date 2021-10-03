package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var dishes= ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dishes.add("HamBurger")
        dishes.add("Pizza")
        dishes.add("Mexican")
        dishes.add("American")
        dishes.add("Chinese")

        btnDecide.setOnClickListener(){
            var randomNum= (0..(dishes.size-1)).random()
            list_item.text=dishes.get(randomNum)
        }
        btnAdd.setOnClickListener(){
            if(!dishes.contains(editText.text.toString())){
                dishes.add(editText.text.toString())
                Toast.makeText(this,"Food Added",Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Already added", Toast.LENGTH_SHORT).show()
            }



        }


    }





}
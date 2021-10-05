package com.example.walmartlab1

import kotlinx.android.synthetic.main.activity_shopping.*



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        tvWelcome.text = intent.getStringExtra("EMAIL")
        imgElectronics.setOnClickListener{
            Toast.makeText(this, "You have chosen the Electronics category of shopping ", Toast.LENGTH_SHORT).show()
        }
        imgClothing.setOnClickListener{
            Toast.makeText(this, "You have chosen the Clothing category of shopping ", Toast.LENGTH_SHORT).show()
        }
        imgBeauty.setOnClickListener{
            Toast.makeText(this, "You have chosen the Beauty category of shopping ", Toast.LENGTH_SHORT).show()
        }
        imgFood.setOnClickListener{
            Toast.makeText(this, "You have chosen the Food category of shopping ", Toast.LENGTH_SHORT).show()
        }

    }
}
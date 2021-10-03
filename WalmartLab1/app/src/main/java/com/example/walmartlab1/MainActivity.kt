package com.example.walmartlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv=findViewById<TextView>(R.id.forget);
        tv.movementMethod=LinkMovementMethod();
        tv.setOnClickListener {
            Toast.makeText(this,"Forget password clicked",Toast.LENGTH_SHORT).show();
        }
    }
}
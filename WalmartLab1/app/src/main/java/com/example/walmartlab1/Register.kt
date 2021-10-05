package com.example.walmartlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        btnSignIn.setOnClickListener {
            if(edtFirstName != null || edtLastName != null||edtEmail != null ||edtPassword!=null) {
                var user = User(edtFirstName.text.toString(),edtLastName.text.toString(),edtEmail.text.toString(),edtPassword.text.toString())
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("USER", user)
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }
    }

    // this event will enable the back
    // function to the button on press
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }





}
package com.example.walmartlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import android.content.Intent

class MainActivity : AppCompatActivity() {
    var users = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        var success= false

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.getSerializableExtra("USER") as? User

        if (user != null) {
            users.add(user)
        }
        populateUserData()

        signIn.setOnClickListener {
            for (user in users){
                if (user.email == email.text.toString() && user.password == password.text.toString()){

                    success = true
                    Toast.makeText(this,"Successfully signed in!!!", Toast.LENGTH_SHORT).show()

                    var intent = Intent(this,ShoppingActivity::class.java)
                    intent.putExtra("EMAIL", email.text.toString())
                    startActivity(intent)
                }
            }

            if (!success)
                Toast.makeText(this,"Login or Password is incorrect", Toast.LENGTH_SHORT).show()
        }

        register.setOnClickListener {
            var intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }



    }

    private fun populateUserData() {
        users.add(User("Krishna","Jala","kjal@miu.edu","krishna"))
        users.add(User("saloni","Vora","saloni@miu.edu","saloni"))
        users.add(User("Basma","Ashour","basma@miu.edu","basma"))
        users.add(User("Shristi","Maharjan","shristi@miu.edu","shristi"))
        users.add(User("Anju","Majoka","anju@miu.edu","anju"))

    }
}
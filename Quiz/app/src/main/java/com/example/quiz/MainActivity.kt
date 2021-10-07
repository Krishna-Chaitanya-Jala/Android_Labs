package com.example.quiz

import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {
    var points:Double = 0.0
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var date= Calendar.getInstance().time

        val formatter= SimpleDateFormat.getDateInstance()
        val formatedDate= formatter.format(date)

        groupradio.clearCheck()

        btnSubmit.setOnClickListener{
            var selectedRadio = groupradio.checkedRadioButtonId
            if (selectedRadio == r1.id)
                points += 50
            if (c1.isChecked && c2.isChecked){
                points += 50
            }

            val dialogBuilder = AlertDialog.Builder(this)

            // set message of alert dialog
            if(points>0) {
                dialogBuilder.setMessage("Congratulations! You submitted on $formatedDate, You achieved $points %")
                    // if the dialog is cancelable
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Exit", DialogInterface.OnClickListener { dialog, id ->
                        finish()
                    })
            }
            else
            {
                dialogBuilder.setMessage("You submitted on $formatedDate, Sorry you scored $points%")

                    .setCancelable(false)
                    .setPositiveButton("Exit",DialogInterface.OnClickListener{dialog, id ->
                        dialog.dismiss()
                        finish()
                    })
            }
            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("Exam finished!")
            // show alert dialog
            alert.show()


        }
        btnReset.setOnClickListener{
            groupradio.clearCheck()
            c1.isChecked = false
            c2.isChecked = false
            c3.isChecked = false
        }

    }
}
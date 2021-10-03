    package com.example.versions

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add= findViewById<Button>(R.id.addVersion)

        add.setOnClickListener {
            val tableRow = TableRow(getApplicationContext())
            val layoutParams= TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams

            var version=androidVersion.text.toString()
            var code_name=codeName.text.toString()

            var columnOne= TextView(this)
            var columnTwo= TextView(this)
            columnOne.text=version;
            columnTwo.text=code_name;
            custom(columnOne)
            custom(columnTwo)

            tableRow.addView(columnOne,0)
            tableRow.addView(columnTwo,1)
            versionLayout.addView(tableRow)
        }
    }

        fun custom(textView:TextView){
            textView.setBackgroundColor(Color.parseColor("#859C9C"));
            textView.setTextSize(18f);
            textView.gravity=Gravity.CENTER;

        }


}
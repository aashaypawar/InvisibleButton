package org.geeksforgeeks.invisiblebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton1 = findViewById<Button>(R.id.button1)
        val mButton2 = findViewById<Button>(R.id.button2)

        var temp = false
        mButton1.setOnClickListener {
            if(!temp){
                mButton2.visibility = View.INVISIBLE
                Toast.makeText(applicationContext, "Invisible", Toast.LENGTH_SHORT).show()
            } else {
                mButton2.visibility = View.VISIBLE
                Toast.makeText(applicationContext, "Visible", Toast.LENGTH_SHORT).show()
            }
            temp = !temp
        }
    }
}
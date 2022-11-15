package com.example.praca1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x=1
        findViewById<Button>(R.id.prev).setOnClickListener {
            if(x==2){
                x=1
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ben)
            }
            else{
                if(x==3){
                    x=2
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.finger)
                }
                else{
                    x=3
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tree)
                }
            }
        }

        findViewById<Button>(R.id.next).setOnClickListener {
            if(x==3){
                x=1
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ben)
            }
            else{
                if(x==1){
                    x=2
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.finger)
                }
                else{
                    x=3
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tree)
                }
            }
        }


    }
}
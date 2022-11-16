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


        val silniaRun = findViewById<Button>(R.id.runSilnia)

        val silniaInput = findViewById<EditText>(R.id.silnia)


        silniaRun.setOnClickListener {
            val inputInt = silniaInput.text.toString().toInt()
            if(inputInt<=10 && inputInt>=0) {
                var liczbaZSilni = 1
                if (inputInt == 0 || inputInt == 1) {
                    liczbaZSilni = 1
                } else {
                    for (i in 2..inputInt)
                        liczbaZSilni *= i
                }
                val text = liczbaZSilni.toString()
                findViewById<TextView>(R.id.wynik1).text = (text)
            }
            else{
                findViewById<TextView>(R.id.wynik1).text = ("blad wpisania")
            }
        }


    }
}
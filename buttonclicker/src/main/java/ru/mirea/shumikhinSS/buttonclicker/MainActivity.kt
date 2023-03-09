package ru.mirea.shumikhinSS.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvOut: TextView
    lateinit var btnWhoAmI: Button
    lateinit var btnItIsNotMe: Button
    lateinit var chBox: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvOut = findViewById(R.id.tvOut)
        btnWhoAmI = findViewById(R.id.btnWhoAmI)
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe)
        chBox = findViewById(R.id.checkBox)
        btnWhoAmI.setOnClickListener{
            tvOut.setText("Мой номер по списку 28")
            chBox.isChecked = !chBox.isChecked
        }
    }
    fun itIsNotMe(view: View){
        tvOut.setText("Это не я сделал")
        chBox.isChecked = !chBox.isChecked
    }
}
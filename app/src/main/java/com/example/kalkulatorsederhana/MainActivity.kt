package com.example.kalkulatorsederhana


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulatorsederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        main = ActivityMainBinding.inflate(layoutInflater)
        val view = main.root
        setContentView(view)

        val input1 = main.input1
        val input2 = main.input2
        val tambah = main.plus
        val kurang = main.minus
        val kali = main.times
        val bagi = main.divide
        val hasil = main.nilaiHasil
        val pindah = main.pindahBrowser


        tambah.setOnClickListener {
            val nilai1 = input1.text.toString()
            val nilai2 = input2.text.toString()

            if(nilai1.isEmpty() || nilai2.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            }
            else{
                val total = nilai1.toFloat() + nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        kurang.setOnClickListener{
            val nilai1 = input1.text.toString()
            val nilai2 = input2.text.toString()

            if(nilai1.isEmpty() || nilai2.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            }
            else{
                val total = nilai1.toFloat() - nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        kali.setOnClickListener {
            val nilai1 = input1.text.toString()
            val nilai2 = input2.text.toString()

            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            } else {
                val total = nilai1.toFloat() * nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        bagi.setOnClickListener{
            val nilai1 = input1.text.toString()
            val nilai2 = input2.text.toString()

            if(nilai1.isEmpty() || nilai2.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            }
            else{
                val total = nilai1.toFloat() / nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        pindah.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"))
            startActivity(intent)
        }
    }
}
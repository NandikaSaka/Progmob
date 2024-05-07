@file:Suppress("NAME_SHADOWING")

package com.example.kalkulatorsederhana


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

        tambah.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if(nilai1.isEmpty() || nilai2.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            }
            else{
                var total = nilai1.toFloat() + nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        kurang.setOnClickListener{
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if(nilai1.isEmpty() || nilai2.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            }
            else{
                var total = nilai1.toFloat() - nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        kali.setOnClickListener{
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if(nilai1.isEmpty() || nilai2.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
            }
            else{
                var total = nilai1.toFloat() * nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }

            bagi.setOnClickListener{
                var nilai1 = input1.text.toString()
                var nilai2 = input2.text.toString()

                if(nilai1.isEmpty() || nilai2.isEmpty()){
                    Toast.makeText(this, "Mohon lengkapi kedua datanya!", Toast.LENGTH_SHORT).show()
                }
                else{
                    var total = nilai1.toFloat() / nilai2.toFloat()
                    hasil.text = total.toString()
                    input1.text.clear()
                    input2.text.clear()
                }
            }
        }
    }
}
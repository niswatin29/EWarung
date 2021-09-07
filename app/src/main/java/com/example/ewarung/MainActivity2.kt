package com.example.ewarung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var kurang1: ImageButton
    private lateinit var kurang2: ImageButton
    private lateinit var plus1: ImageButton
    private lateinit var plus2: ImageButton
    private lateinit var jum1: TextView
    private lateinit var jum2: TextView
    private lateinit var totalBayar: TextView
    private lateinit var jumlahtotal: TextView
    private var jumlah1: Int = 0
    private var jumlah2: Int = 0
    private var jumtotal: Int = 0
    private var totalBayar1: Int = 0
    private var totalBayar2: Int = 0
    private var totBay: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        kurang1 = findViewById(R.id.imageButton)
        kurang2 = findViewById(R.id.imageButton3)
        plus1 = findViewById(R.id.imageButton2)
        plus2 = findViewById(R.id.imageButton4)
        jum1 = findViewById(R.id.textView20)
        jum2 = findViewById(R.id.textView27)
        jumlahtotal = findViewById(R.id.textView31)
        totalBayar = findViewById(R.id.textView33)
    }
    fun setMins(view: View) {
        jumlah1=jum1.text.toString().toInt()
        if (jumlah1==0){
            Toast.makeText(this,"minum pesanan 1",Toast.LENGTH_LONG).show()
        }else{
            jumlah1=jumlah1 - 1
            jum1.setText(jumlah1.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }

    }
    fun setPlus2(view: View) {
        jumlah1=jum1.text.toString().toInt()
        if (jumlah1==5){
            Toast.makeText(this,"minum pesanan 5",Toast.LENGTH_LONG).show()
        }else{
            jumlah1=jumlah1+1
            jum1.setText(jumlah1.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setMins2(view: View) {
        jumlah2 = jum2.text.toString().toInt()
        if (jumlah2 == 0) {
            Toast.makeText(this, "minum pesanan 1", Toast.LENGTH_LONG).show()
        } else {
            jumlah2 = jumlah2 - 1
            jum2.setText(jumlah2.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setPlus3(view: View) {
        jumlah2 = jum2.text.toString().toInt()
        if (jumlah1 == 5) {
            Toast.makeText(this, "minum pesanan 5", Toast.LENGTH_LONG).show()
        } else {
            jumlah2 = jumlah2 + 1
            jum2.setText(jumlah2.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    private fun setJumTotalBeli(){
        jumlah2=jum2.text.toString().toInt()
        jumlah1=jum1.text.toString().toInt()
        jumtotal=jumlah1+jumlah2
        jumlahtotal.setText(jumtotal.toString())
    }
    private fun setJumTotalBayar(){
        jumlah2=jum2.text.toString().toInt()
        jumlah1=jum1.text.toString().toInt()
        totalBayar2= jumlah2+22000
        totalBayar1= jumlah1+20000
        totBay=totalBayar1+totalBayar2
        totalBayar.setText(totBay.toString())
    }

    fun setBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
       }

    }


package com.example.uts_22027

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var edittitle : EditText
    lateinit var editwatch : String
    lateinit var editrg : RadioGroup
    lateinit var editradio : RadioButton
    lateinit var editradio2 : RadioButton
    lateinit var editcek : RadioButton
    lateinit var tahun : String
    lateinit var hourr :String
    lateinit var minutee : String
    lateinit var genree : String
    lateinit var spinneredit : Spinner
    lateinit var spinneredit2 : Spinner
    lateinit var spinneredit3 : Spinner
    lateinit var butOk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        edittitle = findViewById(R.id.isititle)
        editrg = findViewById(R.id.rgg)
        editradio = findViewById(R.id.rb1)
        editradio2 = findViewById(R.id.rb2)
        spinneredit = findViewById(R.id.spinner1)
        spinneredit2 = findViewById(R.id.spinner2)
        spinneredit3 = findViewById(R.id.spinner3)
        butOk = findViewById(R.id.buttonOk)

        butOk.setOnClickListener {
            val pilihan = editrg!!.checkedRadioButtonId
            editcek = findViewById(pilihan)
            editwatch = editcek.text.toString()

            tahun = spinneredit.selectedItem.toString()
            hourr = spinneredit2.selectedItem.toString()
            minutee = spinneredit3.selectedItem.toString()

            val moveIntent = Intent(this@MainActivity, MainActivity2::class.java)
            moveIntent.putExtra(MainActivity2.EXTRA_TITLE, edittitle.text.toString())
            moveIntent.putExtra(MainActivity2.EXTRA_WATCH, editwatch)
            //moveIntent.putExtra(MainActivity2.EXTRA_GENRE, genree)
            moveIntent.putExtra(MainActivity2.EXTRA_YEAR, tahun)
            moveIntent.putExtra(MainActivity2.EXTRA_DURATION, hourr)
            moveIntent.putExtra(MainActivity2.EXTRA_MINUTE, minutee)

            startActivity(moveIntent)


        }


    }
}
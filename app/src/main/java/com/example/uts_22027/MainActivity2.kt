package com.example.uts_22027

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    companion object{
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_WATCH = "EXTRA_WATCH"
        const val EXTRA_GENRE = "EXTRA_GENRE"
        const val EXTRA_YEAR = "EXTRA_YEAR"
        const val EXTRA_DURATION = "EXTRA_DURATION"
        const val EXTRA_MINUTE = "EXTRA_MINUTE"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val title : TextView = findViewById(R.id.edittitle)
        val watch : TextView = findViewById(R.id.editwatch)
        //val genre : TextView = findViewById(R.id.editgenre)
        val year : TextView = findViewById(R.id.edityear)
        val durasi : TextView = findViewById(R.id.editduration)


        val judul = intent.getStringExtra(EXTRA_TITLE)
        val nonton = intent.getStringExtra(EXTRA_WATCH)
//        val gen = intent.getStringExtra(EXTRA_GENRE)
        val tahun = intent.getStringExtra(EXTRA_YEAR)
        val durationnn = intent.getStringExtra(EXTRA_DURATION)
        val minuteee = intent.getStringExtra(EXTRA_MINUTE)



        title.text ="title : $judul"
        watch.text ="Watch For : $nonton"
//        genre.text ="$gen"
        year.text ="Year : $tahun"
        durasi.text ="Duration : $durationnn $minuteee"


    }
}
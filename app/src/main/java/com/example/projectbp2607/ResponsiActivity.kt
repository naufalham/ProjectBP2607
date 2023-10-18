package com.example.projectbp2607

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        //instance
        val rvBuku: RecyclerView = findViewById(R.id.recyclerViewFasilitas)


        //set layout manager di recyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<Fasilitas>()
        data.add(
            Fasilitas(R.drawable.perpus,"Perpustakaan",
            "Perpustakaan terdapat pada gedug utama mulai lantai 1 hingga 4",
                "Terdapat koleksi buku untuk semua kalangan, mulai dari anak-anak hingga dewasa. Perpustakaan dilengkapi fasilitas lengkap sepertiruang baca yang tenang dan nyaman, pendingin udara dan tata letakbuku telah diatur sedemikian rupa agae pengunjung nyaman"))
        data.add(Fasilitas(R.drawable.bermain,"Area Bermain",
                "Perpustakaan terdapat pada gedug utama mulai lantai 1 hingga 4",
                "Terdapat koleksi buku untuk semua kalangan, mulai dari anak-anak hingga dewasa. Perpustakaan dilengkapi fasilitas lengkap sepertiruang baca yang tenang dan nyaman, pendingin udara dan tata letakbuku telah diatur sedemikian rupa agae pengunjung nyaman"))
        data.add(Fasilitas(R.drawable.makan,"Area Food Court",
            "Perpustakaan terdapat pada gedug utama mulai lantai 1 hingga 4",
            "Terdapat koleksi buku untuk semua kalangan, mulai dari anak-anak hingga dewasa. Perpustakaan dilengkapi fasilitas lengkap sepertiruang baca yang tenang dan nyaman, pendingin udara dan tata letakbuku telah diatur sedemikian rupa agae pengunjung nyaman"))
        //set adapter
        val adapter = AdapterResponsi(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter
    }
}
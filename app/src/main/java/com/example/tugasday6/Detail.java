package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Detail extends AppCompatActivity {

    // Deklarasikan variabel yang dibutuhkan
    private String namaItem;
    private String deskripsiItem;
    private String hargaItem;
    private int gambarItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        namaItem = intent.getStringExtra("nama_item");
        deskripsiItem = intent.getStringExtra("deskripsi_item");
        hargaItem = intent.getStringExtra("harga_item");
        gambarItem = intent.getIntExtra("gambar_item", 0); // Perbaikan: Menggunakan key yang benar

        // Tampilkan informasi item di UI
        TextView namaItemTextView = findViewById(R.id.NamaItem);
        TextView deskripsiItemTextView = findViewById(R.id.DeskripsiItem);
        TextView hargaItemTextView = findViewById(R.id.HargaItem);
        ImageView gambarItemImageView = findViewById(R.id.gambarItem);

        namaItemTextView.setText(namaItem);
        deskripsiItemTextView.setText(deskripsiItem);
        hargaItemTextView.setText(hargaItem);

        // Perbaikan: Gunakan setImageResource untuk menetapkan gambar
        gambarItemImageView.setImageResource(gambarItem);
    }

    // Metode untuk menanggapi klik tombol Share
    public void onShareButtonClick(View view) {
        String shareMessage = "Nama Item: " + namaItem + "\nDeskripsi: " + deskripsiItem + "\nHarga: " + hargaItem;

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}




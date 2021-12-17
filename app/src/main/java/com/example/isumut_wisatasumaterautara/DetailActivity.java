package com.example.isumut_wisatasumaterautara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        TextView nama = findViewById(R.id.nama);
        TextView jenis = findViewById(R.id.jenis);
        ImageView gambar = findViewById(R.id.gambar);
        TextView deskripsi = findViewById(R.id.deskripsi);

        Bundle bundle = getIntent().getExtras();

        String namaa = bundle.getString("nama");
        String jeniss = bundle.getString("jenis");
        String gambarr = bundle.getString("gambar");
        String deskripsii = bundle.getString("deskripsi");


        Glide.with(this).load(gambarr).into(gambar);
        jenis.setText(jeniss);
        nama.setText(namaa);
        deskripsi.setText(deskripsii);

    }
}
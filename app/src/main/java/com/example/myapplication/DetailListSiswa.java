package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailListSiswa extends AppCompatActivity {

    TextView TextView;
    ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_siswa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent in = getIntent();

        String nama = in.getStringExtra("nama");
        String absen = in.getStringExtra("absen");
        String alamat = in.getStringExtra("alamat");
        int image = in.getIntExtra("image", 0);

        TextView tvNama = findViewById(R.id.Nama1);
        TextView tvAbsen = findViewById(R.id.absen1);
        TextView tvAlamat = findViewById(R.id.alamat1);
        ImageView imgUser = findViewById(R.id.imageView2);

        tvNama.setText(nama);
        tvAbsen.setText(absen);
        tvAlamat.setText(alamat);
        imgUser.setImageResource(image);



    }
}
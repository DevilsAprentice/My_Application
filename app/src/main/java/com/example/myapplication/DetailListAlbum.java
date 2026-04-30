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

public class DetailListAlbum extends AppCompatActivity {

    TextView TextView;
    ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_album);

        Intent in = getIntent();

        String nama = in.getStringExtra("nama");
        String tracks = in.getStringExtra("tracks");
        String year = in.getStringExtra("year");
        int image = in.getIntExtra("image", 0);

        TextView tvNama = findViewById(R.id.nama);
        TextView tvTracks = findViewById(R.id.tracks);
        TextView tvYear = findViewById(R.id.year);
        ImageView imgUser = findViewById(R.id.ImageView1);

        tvNama.setText(nama);
        tvTracks.setText(tracks);
        tvYear.setText(year);
        imgUser.setImageResource(image);
    }
}
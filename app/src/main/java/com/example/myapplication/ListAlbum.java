package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAlbum extends AppCompatActivity {
    RecyclerView rvListAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_album);

        rvListAlbum = findViewById(R.id.rvListAlbum);

        ArrayList<AlbumModel>listDataAlbum = new ArrayList<>();
        listDataAlbum.add(new AlbumModel("Static Age","17 Tracks","1978",R.drawable.staticage));
        listDataAlbum.add(new AlbumModel("American Psycho","17 Tracks","1997",R.drawable.americanpsycho));
        listDataAlbum.add(new AlbumModel("Saturday Night Wrist","12 Tracks","2006",R.drawable.deftones));
        listDataAlbum.add(new AlbumModel("Famous Monster","10 Tracks","1999",R.drawable.famousmonster));
        listDataAlbum.add(new AlbumModel("The Bends","6 Tracks","1995",R.drawable.thebends));
        listDataAlbum.add(new AlbumModel("The Queen Is Dead","3 Tracks","1986",R.drawable.thequeenisdeath));
        listDataAlbum.add(new AlbumModel("Suburban Dare Devils","12 Tracks","2024",R.drawable.suburbandaredevil));
        listDataAlbum.add(new AlbumModel("Peace Sels","2 Tracks","1986",R.drawable.peacesels));
        listDataAlbum.add(new AlbumModel("Hatful of Hollow","3 Tracks","1984",R.drawable.hatefullhollow));
        listDataAlbum.add(new AlbumModel("Healthen Chemistry","4 Tracks","2002",R.drawable.healthen));

        AdapterListAlbum adapter = new AdapterListAlbum(listDataAlbum, new AdapterListAlbum.OnItemClickListener() {

            // 2. Change the parameter to AlbumModel
            @Override
            public void onItemClick(AlbumModel album) {
                Intent in = new Intent(ListAlbum.this, DetailListAlbum.class);
                // You can pass the album name to the detail activity like this:
                in.putExtra("nama", album.getNama());
                in.putExtra("tracks", album.getTracks());
                in.putExtra("year", album.getYear());
                in.putExtra("image", album.getImageUser());
                startActivity(in);
            }
        });


        rvListAlbum.setLayoutManager(new LinearLayoutManager(this));
        rvListAlbum.setAdapter(adapter);

    }
}
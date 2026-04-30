package com.example.myapplication;

public class AlbumModel {

    String nama;
    String tracks;
    String year;
    int imageUser;

    public String getTracks() {
        return tracks;
    }

    public String getYear() {
        return year;
    }

    public String getNama() {
        return nama;
    }

    public int getImageUser(){
        return imageUser;
    }

    public AlbumModel(String nama, String year  , String tracks, int imageUser) {
        this.nama = nama;
        this.year = year;
        this.tracks = tracks;
        this.imageUser = imageUser;
    }
}

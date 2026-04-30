package com.example.myapplication;

import java.io.Serializable;

public class SiswaModel implements Serializable {
    String nama;
    String alamat;
    String absen;
    int imageUser;

    public String getAbsen() {
        return absen;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getImageUser(){
        return imageUser;
    }

    public SiswaModel(String nama, String alamat, String absen, int imageUser) {
        this.nama = nama;
        this.alamat = alamat;
        this.absen = absen;
        this.imageUser = imageUser;
    }
}
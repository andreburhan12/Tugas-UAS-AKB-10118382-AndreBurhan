package com.example.andre_uasakb.model;

// 14 Agustus 2021
//
//        10118382
//        Andre Burhan
//        IF - 9

public class WisataModel {

    String nama,alamat,deskripsi,foto;

    WisataModel()
    {

    }
    public WisataModel(String nama, String alamat, String deskripsi, String foto) {
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
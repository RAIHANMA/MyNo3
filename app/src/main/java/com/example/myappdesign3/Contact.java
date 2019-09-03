package com.example.myappdesign3;

import java.sql.Time;

public class Contact {
    private String nama, status, waktu, txtdes;
    private Integer photoPic;
    public Contact(String nama,String status,String waktu,String txtdes, Integer photoPic){
        this.nama = nama;
        this.status = status;
        this.waktu = waktu;
        this.txtdes = txtdes;
        this.photoPic = photoPic;

    }
    public  String getNama(){return nama;}
    public  String getStatus(){return status;}
    public  String getWaktu(){return waktu;}
    public  String getTxtdes(){return txtdes;}
    public  Integer getPhotoPic(){return photoPic;}


}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author faizd
 */
public class Pengumuman {
    private String idPengumuman;
    private String judul;
    private String isi;
    
    Pengumuman(String idPEngumuman, String judul, String isi){
        this.idPengumuman = idPengumuman;
        this.judul = judul;
        this.isi = isi;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public String getIsi(){
        return isi;
    }
}

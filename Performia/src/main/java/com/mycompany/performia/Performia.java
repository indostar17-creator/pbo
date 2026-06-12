/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.performia;
import java.util.ArrayList;
/**
 *
 * @author ARTHES
 */
public class Performia {
    public static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    public static ArrayList<Pengumuman> listPengumuman = new ArrayList<>();
    public static void initDummyData() {
        Karyawan k1 = new Karyawan("K01", "Arthes", "arthes@mail", "123", "IT", 1500);
        Karyawan k2 = new Karyawan("K02", "Faiz", "faiz@mail", "123", "IT", 1200);
        
        listKaryawan.add(k1);
        listKaryawan.add(k2);
        System.out.println("Stok dummy Karyawan berhasil dimuat!");
        
        Pengumuman p1 = new Pengumuman("1", "Jadwal Rapat", "Waktu: 09:00 WIB");
        Pengumuman p2 = new Pengumuman("2", "Judul2", "Isi2");
        Pengumuman p3 = new Pengumuman("3", "Judul3", "Isi3");
        Pengumuman p4 = new Pengumuman("4", "Judul4", "Isi4");
        
        listPengumuman.add(p1);
        listPengumuman.add(p2);
        listPengumuman.add(p3);
        listPengumuman.add(p4);
    }
    public static void main(String[] args) {
        initDummyData(); 
        
    }
    
    public String getNama(int indexKaryawan){
        initDummyData();
        return listKaryawan.get(indexKaryawan).getNama();
    }
    
    public String getJudulPengumuman(int indexJudulPengumuman){
        initDummyData();
        return listPengumuman.get(indexJudulPengumuman).getJudul();
    }
    public void setIsiPengumuman (int indexIsiPengumuman, String isi){
        initDummyData();
        listPengumuman.get(indexIsiPengumuman).setIsi(isi);
    }
    public String getIsiPengumuman(int indexIsiPengumuman){
        initDummyData();
        return listPengumuman.get(indexIsiPengumuman).getIsi();
    }
}
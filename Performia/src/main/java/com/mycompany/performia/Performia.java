/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.performia;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author ARTHES
 */
public class Performia {
    public static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    public static ArrayList<Pengumuman> listPengumuman = new ArrayList<>();
    public static ArrayList<Tugas> listTugas = new ArrayList<>();
    public static void initDummyData() {
        
        listKaryawan.clear();
        listPengumuman.clear();
        listTugas.clear();
        
        Karyawan k1 = new Karyawan("K01", "Arthes", "arthes@mail", "123", "IT", 1100); //XP awal diubah ke 1100
        Karyawan k2 = new Karyawan("K02", "Faiz", "faiz@mail", "123", "IT", 1200);
        Karyawan k3 = new Karyawan("K03", "Zefa", "zefa@mail", "123", "Cleaning Service", 800);
        Karyawan k4 = new Karyawan("K04", "McSakinah", "mcsakinah@mail", "123", "IT", 900);
        listKaryawan.add(k1);
        listKaryawan.add(k2);
        listKaryawan.add(k3);
        listKaryawan.add(k4);
        System.out.println("Stok dummy Karyawan berhasil dimuat!");
        
        Pengumuman p1 = new Pengumuman("1", "Pengumuman Rapat Divisi", "");
        Pengumuman p2 = new Pengumuman("2", "Pengumuman Pelatihan Keterampilan Komunikasi", "");
        Pengumuman p3 = new Pengumuman("3", "Peringatan Perbaikan Sistem", "");
        listPengumuman.add(p1);
        listPengumuman.add(p2);
        listPengumuman.add(p3);
        
        Tugas t1 = new Tugas("1", "Maintenance the website", LocalDate.of(2025, 11, 10), LocalDate.of(2026, 02, 01), "On Going");
        Tugas t2 = new Tugas("2", "Accounting problem report", LocalDate.of(2025, 12, 19), LocalDate.of(2026, 01, 15), "On Going");
        Tugas t3 = new Tugas("3", "Fire the rookie", LocalDate.of(2025, 03, 24), LocalDate.of(2026, 8, 1), "On Going");
        Tugas t4 = new Tugas("4", "Change Division Head", LocalDate.of(2025, 03, 02), LocalDate.of(2026, 04, 20), "On Going");
        Tugas t5 = new Tugas("5", "Laporan Evaluasi", LocalDate.of(2025, 03, 02), LocalDate.of(2026, 04, 20), "On Going");
        Tugas t6 = new Tugas("6", "Laporan Evaluasi 2", LocalDate.of(2025, 03, 02), LocalDate.of(2026, 04, 25), "On Going");
        listTugas.add(t1);
        listTugas.add(t2);
        listTugas.add(t3);
        listTugas.add(t4);
        listTugas.add(t5);
        listTugas.add(t6);
    }
    public static void main(String[] args) {
        initDummyData(); 
        
    }
    
    public String getNama(int indexKaryawan){
        return listKaryawan.get(indexKaryawan).getNama();
    }
    public String getJudulPengumuman(int indexJudulPengumuman){
        return listPengumuman.get(indexJudulPengumuman).getJudul();
    }
    public void setIsiPengumuman (int indexIsiPengumuman, String isi){
        listPengumuman.get(indexIsiPengumuman).setIsi(isi);
    }
    public String getIsiPengumuman(int indexIsiPengumuman){
        return listPengumuman.get(indexIsiPengumuman).getIsi();
    }
    public String getJudulTugas(int indexJudulTugas){
        return listTugas.get(indexJudulTugas).getJudul();
    }
    public String getTenggatWaktu(int index){
        return listTugas.get(index).getTanggalBatas().toString();
    }
    public int getJumlahTugas(){
        return listTugas.size();
    }
    public String getTanggalDibuatTugas(int index){
        return listTugas.get(index).getTanggalDibuat().toString();
    }
    public void setStatusTugas(int index, String statusTugasBaru){
        listTugas.get(index).setStatus(statusTugasBaru);
    }
    public String getStatusTugas(int index){
        return listTugas.get(index).getStatus();
    }
}
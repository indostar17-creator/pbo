/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author MSI Gaming
 */
import java.time.LocalDate;

public class Tugas {

    private String idTugas;
    private String judul;
    private LocalDate tanggalDibuat;
    private LocalDate tanggalBatas;
    private LocalDate tanggalDikumpulkan;
    private String status;
    private int skorXP;

    public Tugas() {

    }

    public Tugas(
            String idTugas,
            String judul,
            LocalDate tanggalDibuat,
            LocalDate tanggalBatas,
            String status, int skorXP) {

        this.idTugas = idTugas;
        this.judul = judul;
        this.tanggalDibuat = tanggalDibuat;
        this.tanggalBatas = tanggalBatas;
        this.status = status;
        this.skorXP = skorXP;
    }

    public String getIdTugas() {
        return idTugas;
    }
    
    public String getJudul() {
        return judul;
    }

    public LocalDate getTanggalDibuat() {
        return tanggalDibuat;
    }

    public LocalDate getTanggalBatas() {
        return tanggalBatas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public LocalDate getTanggalDikumpulkan(){
        return tanggalDikumpulkan;
    }
    public void setTanggalDikumpulkan(){
         this.tanggalDikumpulkan = LocalDate.now();
    }
    
    public void setSkorXP(){
        this.skorXP = skorXP;
    }
    public int getSkorXP(){
        return skorXP;
    }
     
}
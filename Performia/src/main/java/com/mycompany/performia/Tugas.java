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
    private String status;

    public Tugas() {

    }

    public Tugas(
            String idTugas,
            String judul,
            LocalDate tanggalDibuat,
            LocalDate tanggalBatas,
            String status) {

        this.idTugas = idTugas;
        this.judul = judul;
        this.tanggalDibuat = tanggalDibuat;
        this.tanggalBatas = tanggalBatas;
        this.status = status;
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

}
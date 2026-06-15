/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author ARTHES
 */
import java.time.LocalDate;

public class Assignment {

    private String idAssignment;
    private String namaAssignment;
    private LocalDate tanggalDibuat;
    private LocalDate tanggalBatas;
    private String status;

    public Assignment() {

    }

    public Assignment(
            String idAssignment,
            String namaAssignment,
            LocalDate tanggalDibuat,
            LocalDate tanggalBatas,
            String status) {

        this.idAssignment = idAssignment;
        this.namaAssignment = namaAssignment;
        this.tanggalDibuat = tanggalDibuat;
        this.tanggalBatas = tanggalBatas;
        this.status = status;
    }

    public String getIdAssignment() {
        return idAssignment;
    }

    public String getNamaAssignment() {
        return namaAssignment;
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
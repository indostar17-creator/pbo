/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

import java.util.ArrayList;

/**
 *
 * @author ARTHES
 */
public class Karyawan extends Pengguna {
    private String idDivisi;
    private int totalXP;
    private ArrayList<Tugas> listTugas = new ArrayList<>();
  
    public Karyawan(String idUser, String nama, String email, String password, String idDivisi, int totalXP) {
        super(idUser, nama, email, password);
        this.idDivisi = idDivisi;
        this.totalXP = totalXP;        
    }

    public void tambahXP(int poin) {
        this.totalXP += poin;
    }

    public int getTotalXP() {
        return this.totalXP;
    }
    
}

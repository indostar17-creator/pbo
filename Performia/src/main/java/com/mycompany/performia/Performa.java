/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author Zefa
 */
public class Performa extends Kriteria{
    private String idPerforma;
    private float onTimeRate;
    
    public Performa(String idKriteria, String namaKriteria, float bobot, String idPerforma, float onTimeRate){
        super(idKriteria, namaKriteria, bobot);
        this.idPerforma = idPerforma;
        this.onTimeRate = onTimeRate;
    }
    
    public String getIdPerforma(){
        return idPerforma;
    }
    
    public float getOnTimeRate(){
        return onTimeRate;
    }
}

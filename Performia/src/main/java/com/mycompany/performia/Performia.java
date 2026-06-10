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

    public static void initDummyData() {
        Karyawan k1 = new Karyawan("K01", "Arthes", "arthes@mail", "123", "IT", 1500);
        Karyawan k2 = new Karyawan("K02", "Faiz", "faiz@mail", "123", "IT", 1200);
        
        listKaryawan.add(k1);
        listKaryawan.add(k2);
        System.out.println("Stok dummy Karyawan berhasil dimuat!");
    }

    public static void main(String[] args) {
        initDummyData(); 
        
    }
}
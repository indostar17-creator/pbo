/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author ARTHES
 */
public class Assignment {

    private String idAssignment;
    private String namaAssignment;

    public Assignment() {

    }

    public Assignment(String idAssignment, String namaAssignment) {
        this.idAssignment = idAssignment;
        this.namaAssignment = namaAssignment;
    }

    public void setIdAssignment(String idAssignment) {
        this.idAssignment = idAssignment;
    }

    public String getIdAssignment() {
        return idAssignment;
    }

    public void setNamaAssignment(String namaAssignment) {
        this.namaAssignment = namaAssignment;
    }

    public String getNamaAssignment() {
        return namaAssignment;
    }

}
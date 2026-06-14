/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author MSI Gaming
 */

public class TugasHarian extends Tugas {

    private int bonusXP;

    public TugasHarian() {

    }

    public TugasHarian(int bonusXP) {
        this.bonusXP = bonusXP;
    }

    public void setBonusXP(int bonusXP) {
        this.bonusXP = bonusXP;
    }

    public int getBonusXP() {
        return bonusXP;
    }
}
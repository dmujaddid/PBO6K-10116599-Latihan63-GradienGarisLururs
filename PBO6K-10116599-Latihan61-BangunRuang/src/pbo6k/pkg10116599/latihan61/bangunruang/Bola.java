/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan61.bangunruang;

/**
 *
 * @author eka
 */
public abstract class Bola extends BangunRuang {

    private double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        double luas = 4 / 3 * 3.14 * jariJari * jariJari * jariJari;
        return luas;
    }

    

}

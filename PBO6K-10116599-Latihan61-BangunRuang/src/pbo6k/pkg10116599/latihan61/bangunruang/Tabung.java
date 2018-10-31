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
public class Tabung extends BangunRuang {

    private double jariJari;
    private double tinggi;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        double luas = 3.14 * jariJari * jariJari * tinggi;
        return luas;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program untuk menghitung ruang bangun.
 * 
 */
public class Kerucut extends BangunRuang {

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
        double luas = (3.14 * jariJari * jariJari * tinggi) / 3;
        return luas;
    }

}

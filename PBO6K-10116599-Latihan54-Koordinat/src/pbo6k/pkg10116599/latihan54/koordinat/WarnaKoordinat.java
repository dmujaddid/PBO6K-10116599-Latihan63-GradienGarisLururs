/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan54.koordinat;

/**
 *
 * @author eka
 */
public class WarnaKoordinat extends Koordinat {

    public String namaWarna;

    public WarnaKoordinat(String namaWarna, int x, int y) {
        super(x, y);

    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }

}

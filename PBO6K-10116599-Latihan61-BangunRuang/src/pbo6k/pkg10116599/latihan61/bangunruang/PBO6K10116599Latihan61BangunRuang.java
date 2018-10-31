/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan61.bangunruang;

/**
 *
 * @author NAMA : Robby Eka Purnama KELAS : PBO6K NIM : 10116599 Deskripsi
 * Program : Program Bangun Ruang.
 *
 */
public class PBO6K10116599Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       Bola bola = new Bola() {};
       bola.setJariJari(7);
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        
        System.out.println("Volume bola basket\t: " + bola.hitungLuas());
        System.out.println("Volume tabung\t\t: " +tabung.hitungLuas());
        System.out.println("Volume kerucut\t\t: "+kerucut.hitungLuas());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan52.siapakamu;

/**
 *
 * @author eka
 */
public class PBO6K10116599Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        // Output dosen
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        System.out.println("Saya " + dosen.getNama() + " umur " + dosen.getUmur()
                + " tahun sedang mengajar matakuliah " + dosen.getMataKuliah());
        System.out.println();

        // Inisialisasi Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");

        // Output mahasiswa
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        System.out.println("Saya " + mahasiswa.getNama() + " umur " + mahasiswa.getUmur()
                + " tahun sedang belajar di kelas " + mahasiswa.getKelas());

    }

}

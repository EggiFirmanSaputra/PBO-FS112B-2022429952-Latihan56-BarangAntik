/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs112b.pkg2022429952.latihan56.barangantik;

/**
 * @author
 * NAMA     : Eggi Firman Saputra
 * KELAS    : PBO/ FS112B
 * NIM      : 2022429952
 * Deskripsi Program : Manampilkan barang antik. Clild class dipanggil oleh Parent class, di
 * class BarangAntik(parent class) terdapat prosedur tampilUmur untuk menampilkan umur barang antik
 *
 */
public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang antik : "+radio.getNama());
        radio.tampilUmur();
    }
}

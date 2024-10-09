/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.dini012;

/**
 *
 * @author DINI
 */

// Kelas untuk mengelola reservasi hotel 1 ini dikatakan sebagai class turunan
public class ReservasiHotel1 extends ReservasiHotel {
    // disini saya mengembangkan codenya dengan 
    private String layananTambahan;

    // Konstruktor
    public ReservasiHotel1(String tipeKamar, int nomorKamar, int ketersediaan, int lantai, String layananTambahan) {
        super(tipeKamar, nomorKamar, ketersediaan, lantai); // Memanggil konstruktor kelas induk
        this.layananTambahan = layananTambahan;
    }

    // Method untuk mendapatkan layanan tambahan
    public String getLayananTambahan() {
        return layananTambahan;
    }
  
    public String getdetailPemesanan() {
        return super.getDetailPemesanan() + " (Layanan Tambahan: " + layananTambahan + ")";
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.dini012;

/**
 *
 * @author DINI
 */
// Kelas untuk mengelola reservasi hotel
public class ReservasiHotel implements ReservasiHotelInterface {
     String tipeKamar;
     int nomorKamar;
     int ketersediaan; 
     int lantai;
     String detailPemesanan;

    // Konstruktor
    public ReservasiHotel(String tipeKamar, int nomorKamar, int ketersediaan, int lantai) {
        this.tipeKamar = tipeKamar;
        this.nomorKamar = nomorKamar;
        this.ketersediaan = ketersediaan;
        this.detailPemesanan = ""; 
    }

    @Override
    public String getDetailPemesanan() {
        return detailPemesanan;
    }

    @Override
    public String getTipeKamar() {
        return tipeKamar;
    }

    @Override
    public int getNomorKamar() {
        return nomorKamar;
    }

    @Override
    public int getKetersediaan() {
        return ketersediaan;
    }

    @Override
    public int getLantai() {
        return lantai;
    }
    
   
   @Override
    public void setDetailPemesanan(String detailPemesanan) {
        this.detailPemesanan = detailPemesanan; // Mengatur detail pemesanan
    }
  
}


    


    

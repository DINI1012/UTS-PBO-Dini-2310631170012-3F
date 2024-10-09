/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.dini012;

/**
 *
 * @author DINI
 */
import java.util.Scanner;

public class ReservasiHotelMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek ReservasiHotel
        ReservasiHotel hotel1 = new ReservasiHotel("Single Bed", 110, 1, 1);
        ReservasiHotel1 hotel2 = new ReservasiHotel1("Double Bed", 102, 1, 2, "Sarapan Gratis");

        // Meminta pengguna untuk masuk sebagai admin atau customer
        System.out.print("Masukkan level akses (admin/customer): ");
        String levelAkses = scanner.nextLine().toLowerCase();

        // Menu utama
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Memesan kamar.");
            System.out.println("b. Mengecek ketersediaan kamar.");
            System.out.println("c. Melihat detail pesanan.");
            System.out.println("d. Keluar.");
            System.out.print("Pilih opsi: ");
            
            String pilihan = scanner.nextLine().toLowerCase(); // menggunakan string untuk opsi

            switch (pilihan) {
                case "a":
                    // Memesan kamar
                if (levelAkses == "customer") {  
                    System.out.print("Masukkan detail pemesanan: ");
                    hotel1.setDetailPemesanan(scanner.nextLine()); // Langsung set detail pemesanan
                    System.out.println("Reservasi Standard berhasil dibuat!");
                } else {
                    System.out.println("Hanya pelanggan yang dapat memesan kamar.");
                }
                break;

                case "b":
                    // Mengecek ketersediaan kamar
                    System.out.println("Ketersediaan Kamar Standard: " + hotel1.getKetersediaan());
                    System.out.println("Ketersediaan Kamar Premium: " + hotel2.getKetersediaan());
                    break;

                case "c":
                    // Melihat detail pesanan
                    System.out.println("Detail Pemesanan Standard: " + hotel1.getDetailPemesanan());
                    System.out.println("Detail Pemesanan Premium: " + hotel2.getDetailPemesanan());
                    break;

                case "d":
                    // Keluar
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}

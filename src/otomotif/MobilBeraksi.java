/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomotif;

/**
 *
 * @author peper
 */
public class MobilBeraksi {
     public static void main(String[] args) {
        // Membuat beberapa objek mobil
        Mobil mobil1 = new Mobil("Toyota Avanza", "Hitam", 2020, 200_000_000);
        Mobil mobil2 = new Mobil("Honda Brio", "Merah", 2022, 180_000_000);

        // Menampilkan informasi mobil
        System.out.println("Informasi Mobil 1:");
        mobil1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Mobil 2:");
        mobil2.tampilkanInfo();
    }
}


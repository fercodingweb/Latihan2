/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Siswa;

/**
 *
 * @author peper
 */
public class PulpenBeraksi {
    public static void main(String[] args) {
        // Membuat objek Pulpen
        Pulpen pulpen1 = new Pulpen("Pilot", "Biru", 14000);
        Pulpen pulpen2 = new Pulpen("Snowman", "Hitam", 9000);

        // Menampilkan data pulpen
        System.out.println("Informasi Pulpen 1:");
        pulpen1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Pulpen 2:");
        pulpen2.tampilkanInfo();
    }
    
}

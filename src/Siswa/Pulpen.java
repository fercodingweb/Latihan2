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
public class Pulpen {
    
    private String merk;
    private String warna;
    private double harga;

    // Constructor
    public Pulpen(String merk, String warna, double harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    // Mutator (Setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Accessor (Getter)
    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public double getHarga() {
        return harga;
    }

    // Method tambahan
    public void tampilkanInfo() {
        System.out.println("Merk Pulpen : " + merk);
        System.out.println("Warna Pulpen: " + warna);
        System.out.println("Harga Pulpen: Rp" + harga);
    }
}



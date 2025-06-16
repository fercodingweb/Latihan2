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
    private String panjang;

    // Constructor
    public Pulpen(String merk, String warna, double harga, String panjang) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
        this.panjang = panjang;
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
     public void setPanjang(String panjang) {
        this.panjang = panjang;
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
    
    public String getPanjang() {
        return panjang;
    }

    // Method tambahan
    public void tampilkanInfo() {
        System.out.println("Merk Pulpen : " + merk);
        System.out.println("Warna Pulpen: " + warna);
        System.out.println("Harga Pulpen: Rp" + harga);
        System.out.println("Panjang Pulpen: Rp" + panjang);

    }
}



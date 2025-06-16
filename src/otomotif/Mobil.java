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
public class Mobil {
    private String merk;
    private String warna;
    private int tahun;
    private double harga;

    // Constructor
    public Mobil(String merk, String warna, int tahun, double harga) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Setter (Mutator)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter (Accessor)
    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merk Mobil  : " + merk);
        System.out.println("Warna Mobil : " + warna);
        System.out.println("Tahun Mobil : " + tahun);
        System.out.println("Harga Mobil : Rp" + harga);
    }
}
    


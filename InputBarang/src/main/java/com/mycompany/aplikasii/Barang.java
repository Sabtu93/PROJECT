package com.mycompany.aplikasii;

public class Barang {
    private String kode; // Kode barang
    private String jenis; // Jenis barang
    private String lokasi; // Lokasi barang

    // Konstruktor
    public Barang(String kode, String jenis, String lokasi) {
        this.kode = kode;
        this.jenis = jenis;
        this.lokasi = lokasi;
    }

    // Getter untuk kode
    public String getKode() {
        return kode;
    }

    // Getter untuk jenis
    public String getJenis() {
        return jenis;
    }

    // Getter untuk lokasi
    public String getLokasi() {
        return lokasi;
    }

    @Override
    public String toString() {
        return "Kode: " + kode + ", Jenis: " + jenis + ", Lokasi: " + lokasi;
    }
    
    public static void main(String args[]){
        new MainFrame().running();
    }
}
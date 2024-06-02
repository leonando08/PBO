package tes;

public class orang {
 protected String nama;
    protected int usia;

    // Konstruktor
    public orang(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Accessor untuk nama
    public String getNama() {
        return nama;
    }

    // Accessor untuk usia
    public int getUsia() {
        return usia;
    }

    // Mutator untuk usia
    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Method untuk menampilkan informasi orang
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}

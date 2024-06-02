package uts1;

public class Orang {
    // Atribut
    private String nama;
    private int umur;

    // Konstruktor
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Metode
    public void perkenalan() {
        System.out.println("Halo, nama saya " + nama + " dan saya berumur " + umur + " tahun.");
    }
}
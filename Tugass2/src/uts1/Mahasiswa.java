package uts1;

public class Mahasiswa extends Orang {
    // Atribut tambahan
    private String nim;
    private String jurusan;

    // Konstruktor
    public Mahasiswa(String nama, int umur, String nim, String jurusan) {
        super(nama, umur); // Memanggil konstruktor dari kelas Orang
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Accessor (getter) dan Mutator (setter) untuk atribut tambahan
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Override metode perkenalan
    @Override
    public void perkenalan() {
        System.out.println("Halo, nama saya " + getNama() + ", saya berumur " + getUmur() + " tahun. NIM saya " + nim + " dan saya dari jurusan " + jurusan + ".");
    }
}
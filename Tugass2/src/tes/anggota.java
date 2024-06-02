package tes;

public class anggota extends orang {
    protected int idanggota;

    // Konstruktor
    public anggota(String nama, int usia, int idanggota) {
        super(nama , usia); // Memanggil konstruktor superclass
        this.idanggota = idanggota;
    }

    // Accessor untuk ID anggota
    public int getIdanggota() {
        return idanggota;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }

    // Method khusus untuk Anggota
    public void pinjamBuku(String judulBuku) {
        System.out.println(getNama() + " dengan ID anggota " + idanggota + " meminjam buku: " + judulBuku);
    }
}

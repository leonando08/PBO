package tes;

public class main {
     public static void main(String[] args) {
        // Membuat objek Orang
        orang orang1 = new orang("Alice", 25);
        // Memanggil method dari superclass
        orang1.tampilkanInfo();

        // Membuat objek Anggota
        anggota anggota1 = new anggota("Bob", 30, 1001);
        // Memanggil method dari superclass
        anggota1.tampilkanInfo();
        // Memanggil method dari subclass
        anggota1.pinjamBuku("Pemrograman Java");
    }
}

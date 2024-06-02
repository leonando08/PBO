package uts1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Orang
        Orang orang = new Orang("Budi", 30);
        orang.perkenalan();

        // Membuat objek dari kelas Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Ani", 20, "12345678", "Informatika");
        mahasiswa.perkenalan();

        // Polimorfisme: Referensi kelas Orang, objek kelas Mahasiswa
        Orang orangMahasiswa = new Mahasiswa("Cici", 22, "87654321", "Sistem Informasi");
        orangMahasiswa.perkenalan(); // Memanggil metode perkenalan() yang di-override di kelas Mahasiswa
    }
}
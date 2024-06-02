package ujicoba;

public class Main {
    public static void main(String[] args) {
        //membuat objek dari kelas turunan
        Ebook eb1 = new Ebook("Pemrograman Java", "Leo Nando", 2021, "5MB");
        AudioBook ab1 = new AudioBook ("Belajar Java", "Leo Nando", 2022, "10 Jam");
        
        //mengakses properti menggunakan encapsulasi
        System.out.println(eb1.getJudul() + " oleh " + eb1.getPenulis());
        System.out.println(ab1.getJudul() + " oleh " + ab1.getPenulis());
        
        //menunjukkan polimorphism
        eb1.tampilInfo();
        ab1.tampilInfo();
    }
    
}

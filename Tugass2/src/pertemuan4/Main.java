package pertemuan4;

public class Main {
    public static void main(String[] args) {
        //membuat Objek dari class turunan
        Novel novel1 = new Novel("Bumi Manusia","dedik",2009,"60 Halaman");
        Ebuku Eb1 = new Ebuku("Pemrograman Java","Leo Nando",2020,"10 Mb");
        
        //mengakses mengunakan enkapsulasi
        System.out.println(novel1.getJudul() + " oleh " + novel1.getPenulis());
        System.out.println(Eb1.getJudul() + " oleh " + Eb1.getPenulis());
        
        //menunjukkan polimorphisme
        novel1.tampiInfo();
        Eb1.tampiInfo();
    }
    
}

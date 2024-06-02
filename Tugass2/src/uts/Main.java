package uts;

public class Main {
    //class utama untuk menguji
    public static void main(String[] args) {
        Hewan dog = new Hewan("Bulldog",3);
        dog.tampilkanInfo();
        dog.berSuara();
        
    // membuat objek kucing
        Kucing cat = new Kucing("Kucing Persia",1,"persia");
        cat.tampilkanInfo();
        cat.berSuara();
        
    // mutator untuk mengubah umur
    cat.setUmur(2);
        System.out.println("Setelah ditambah umur:");
        cat.tampilkanInfo();
    }
}

package pertemuan3;

public class Sepatu {
    //atribut
    String merk,warna;
    int ukuran,stok;
    
    //konstruktor
    Sepatu (String merk, String warna, int ukuran, int stok){
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.stok = stok;
    }
    
    //aksesor
    int getupdateSepatu() {
        return stok;
    }
    
    //mutator
    void setupdateSepatu() {
        stok = stok + 10;
    }
    
    //membuat method/fungsi
    void tampilData() {
        System.out.println("Merk :"+merk);
        System.out.println("Warna :"+warna);
        System.out.println("Ukuran :"+ukuran);
        System.out.println("Stok :"+stok);
    }
}

package ujicoba;

//kelas dasar
public class Buku {
    //enkapsulation
    private String judul, penulis;
    private int tahun;
    
    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    
    //membuat mutator

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    //membuat accessor

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }
    
    //polimorphisme
    public void tampilInfo() {
        System.out.println("Buku: " + judul+", Penulis: " + penulis +", Tahun: " + tahun);
    }
    
}

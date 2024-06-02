package pertemuan4;

//class utama
public class Buku {
    //encapsulation
    private String judul,penulis;
    private int tahun;
    
    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public void tampiInfo() {
        System.out.println("Buku: "+judul +", 'Penulis: "+ penulis + ", Tahun: " + tahun);
    }
    
}

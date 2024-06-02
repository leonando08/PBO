package shoes;

public class Sepatu {
    private String merk;
    private String warna;
    private int ukuran;
    
    //method konstruktor
    public Sepatu() {}
    
    //mutator
    public void setMerk(String merk) {
        this.merk = merk;
}
    
    public void setWarna(String warna) {
        this.warna = warna;
}
    public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
}
    
    //accessor
    public String getMerk() {
        return merk;
    }
    
    public String getWarna() {
        return warna;
    }

    public int getUkuran() {
        return ukuran;
    }}
package pertemuan4;

public class Ebuku extends Buku {
    private String ukuranFile;
    
public Ebuku(String judul, String penulis, int tahun, String ukuranFile) {
    super(judul,penulis,tahun);
    this.ukuranFile = ukuranFile;
}

    public String getUkuranFile() {
        return ukuranFile;
    }

    public void setUkuranFile(String ukuranFile) {
        this.ukuranFile = ukuranFile;
    }
    
    //overide
    @Override
    public void tampiInfo() {
    System.out.println("Buku Elektronik: "+getJudul() +", 'Penulis: "+ getPenulis() + ", Tahun: " + getTahun() + ", Ukuran File: " + ukuranFile );
    }
}

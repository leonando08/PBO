package pertemuan4;

//Class Turunan
public class Novel extends Buku{
    private String halaman;
    
    public Novel (String judul,String penulis, int tahun, String halaman) {
        super(judul,penulis,tahun);
        this.halaman = halaman;
}

    public String getHalaman() {
        return halaman;
    }

    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }
    
    //overide
    @Override
    public void tampiInfo() {
    System.out.println("Novel: "+getJudul() +", 'Penulis: "+ getPenulis() + ", Tahun: " + getTahun() + ", Jumlah halaman: " + halaman);
    }   
}

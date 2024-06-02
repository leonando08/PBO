package ujicoba;

///kelas turunan lainnya
public class AudioBook extends Buku {
    private String durasi;
    
    public AudioBook(String judul, String penulis, int tahun, String durasi) {
        super( judul, penulis, tahun);
        this.durasi = durasi;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
    //overide
    @Override
        public void tampilInfo() {
        System.out.println("Audio Book: " + getJudul()+", Penulis: " + getPenulis() +", Tahun: " + getTahun() +", Durasi: " + durasi);
        
    }
    
}

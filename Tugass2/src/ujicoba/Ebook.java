package ujicoba;

//kelas turunan
 public class Ebook extends Buku {
        private String ukuranFile;
        
        public Ebook(String judul, String penulis, int tahun , String ukuranFile) {
            super( judul, penulis, tahun);
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
    public void tampilInfo() {
        System.out.println("Ebook: " + getJudul()+", Penulis: " + getPenulis() +", Tahun: " + getTahun() +", Ukuran file: " + ukuranFile);
        
    }
}
    

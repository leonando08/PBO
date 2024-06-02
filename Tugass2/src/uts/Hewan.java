package uts;

public class Hewan {
    //membuat atribut
    private String jenis;
    private int umur;
    
    //konstructor
    public Hewan ( String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //method 
    public void berSuara(){
        System.out.println("Suara : Guk Guk");
    }
    //method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Jenis: " + jenis +",Umur: " + umur+ "Tahun");
    }
       
}

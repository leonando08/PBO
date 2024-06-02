package uts;

public class Kucing extends Hewan{
    //atribut tambahan yang spesifik kucing
    protected String ras;
    
    //kostructor
    public Kucing(String jenis, int umur, String ras) {
        super (jenis, umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public void berSuara(){
    System.out.println("Suara: Miaww");
    }
    //method untuk menampilkan info
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
    System.out.println("Ras: " + ras);
    }   
}

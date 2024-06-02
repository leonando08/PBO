package pertemuan3;

public class Toko {
     public static void main (String[] args) {
        Sepatu sepatu1 = new Sepatu("Nike","putih",42,10);
        
        Sepatu sepatu2 = new Sepatu("Adidas","Hitam",43,15);
        
        Sepatu sepatu23 = new Sepatu("Puma","Hitam putih",43,10);
        
        sepatu1.tampilData();
        sepatu1.setupdateSepatu();
        System.out.println("Stok setelah ditambahkan :"+sepatu1.getupdateSepatu());
        System.out.println("");
        
        sepatu2.tampilData();
        sepatu2.setupdateSepatu();
        System.out.println("Stok setelah ditambahkan :"+sepatu2.getupdateSepatu());
        System.out.println("");
     }
}

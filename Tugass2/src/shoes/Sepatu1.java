package shoes;

public class Sepatu1 {
    public static void main(String[] args) {
        Sepatu sepatu1 = new Sepatu();
        
        sepatu1.setMerk("Adidas");
        sepatu1.setWarna("Hitam Putih");
        sepatu1.setUkuran(42);
        
        System.out.println("Merk Sepatu: " + sepatu1.getMerk());
        System.out.println("Warna Sepatu: " + sepatu1.getWarna());
        System.out.println("Ukuran Sepatu: " + sepatu1.getUkuran());
    }
    
}

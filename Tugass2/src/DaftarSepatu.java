/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DaftarSepatu {
    public static void main (String[] args) {
        Sepatu sepatusatu = new Sepatu();
        Sepatu sepatudua = new Sepatu();
        
        sepatusatu.merk = "Nike";
        sepatusatu.warna = "Putih";
        sepatusatu.ukuran = 42;
        
        sepatudua.merk = "Adidas";
        sepatudua.warna = "Hitam";
        sepatudua.ukuran = 43;
        
        System.out.println("Merk :" + sepatusatu.merk);
        System.out.println("Warna :" + sepatusatu.warna);
        System.out.println("Ukuran :" + sepatusatu.ukuran);
        System.out.println("");
        
        System.out.println("Merk :" + sepatudua.merk);
        System.out.println("Warna :" + sepatudua.warna);
        System.out.println("Ukuran :" + sepatudua.ukuran);
        
        
    }
    
}

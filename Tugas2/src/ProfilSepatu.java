/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ProfilSepatu {
    public static void main (String[] args) {
        Sepatu sepatuleo = new Sepatu();
        Sepatu sepatunando = new Sepatu();
        
        sepatuleo.Merk = "Nike";
        sepatuleo.Warna = "Putih";
        sepatuleo.Ukuran = 42;
        
        sepatunando.Merk = "adidas";
        sepatunando.Warna = "hitam";
        sepatunando.Ukuran = 43;
        
        System.out.println("Merk : " + sepatuleo.Merk);
        System.out.println("Warna : " + sepatuleo.Warna);
        System.out.println("Ukuran : " + sepatuleo.Ukuran);
        System.out.println(" ");
        
        System.out.println("Merk : " + sepatunando.Merk);
        System.out.println("Warna : " + sepatunando.Warna);
        System.out.println("Ukuran : " + sepatunando.Ukuran);
    
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan02;

/**
 *
 * @author aidanurp
 */
public class Rectangle {
    double panjang;
    double lebar;
    double tinggi;

    public Rectangle() {
        panjang=3;
        lebar=2;
        tinggi=4;
    }
    
    void cetakInfo(){
        System.out.println("======================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("======================");
    }
    double hitungLuas(){
        double luas;
        luas=panjang*lebar*tinggi;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah : "+hitungLuas());
    }
}

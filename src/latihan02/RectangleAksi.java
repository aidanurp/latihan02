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
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 10;
        r1.lebar = 5;
        r1.tinggi = 2;
        
        r1.cetakInfo();
        System.out.println("Luas ractangle = "+r1.hitungLuas());
        r1.cetakLuas();
    }
}

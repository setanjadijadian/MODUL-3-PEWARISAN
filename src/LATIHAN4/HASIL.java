/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN4;

/**
 *
 * @author ASUSVivoBook
 */
public class HASIL {
    public static void main(String[] args) {
        BANGUNDATAR bangundatar=new BANGUNDATAR();
        
        PERSEGI Persegi = new PERSEGI();
        Persegi.sisi=8;
        
        PERSEGIPANJANG perjang =new PERSEGIPANJANG();
        perjang.lebar=11;
        perjang.panjang=2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }
}

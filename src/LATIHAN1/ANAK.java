/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN1;

/**
 *
 * @author ASUSVivoBook
 */
public class ANAK extends AYAH{
    
    double nilaimax=99.9;
    String nama="Dina";
    int age = 17;
    
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat : "+super.Sifat);
        System.out.println("yang bernama : "+nama);
        System.out.println("berumur : "+age+"tahun");
        System.out.println("dengan tinggi Badan : "+super.TB);
        super.hobbi();
}
}
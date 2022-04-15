/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHANPRAKTUM;

/**
 *
 * @author ASUSVivoBook
 */
public class Output {
    public static void main (String [] args) {
        ID pegawai = new ID ();
        pegawai.intro();
       
        
        GAJI karyawan = new GAJI ();
        karyawan.nama();
        karyawan.gender();
        karyawan.posisi();
        karyawan.gaji();
        karyawan.bonus();
     }
}

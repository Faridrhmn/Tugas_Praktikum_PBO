/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wilayah;

/**
 *
 * @author Bahruddin Farid
 */
public class Hotel implements Bangunan{
    int panjang, lebar, jmlKamar;
    String nama, jenisBangunan;

    public Hotel(int panjang, int lebar, int jmlKamar, String nama) {
        jenisBangunan = "hotel";
        this.panjang = panjang;
        this.lebar = lebar;
        this.jmlKamar = jmlKamar;
        this.nama = nama;
    }
    
    @Override
    public double hitungLuas(){
        double luas = (panjang*lebar);
        return luas;
    }
    @Override
    public String kepemilikanLahan(){
        return nama;
    }
    
    @Override
    public int hitungOrang(){
        return jmlKamar;
    }

    @Override
    public String jnsBangunan() {
        return jenisBangunan;
    }
    
}

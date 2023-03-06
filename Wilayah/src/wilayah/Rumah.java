/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wilayah;

/**
 *
 * @author Bahruddin Farid
 */
public class Rumah implements Bangunan {
    int panjang, lebar, jmlKeluarga;
    String nama, jenisBangunan;

    public Rumah(int panjang, int lebar,int jmlKeluarga, String nama) {
        jenisBangunan = "Rumah";
        this.panjang = panjang;
        this.lebar = lebar;
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
        return jmlKeluarga;
    }
    @Override
    public String jnsBangunan() {
        return jenisBangunan;
    }
}

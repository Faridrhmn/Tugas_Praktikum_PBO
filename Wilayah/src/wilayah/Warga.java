/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wilayah;

/**
 *
 * @author Bahruddin Farid
 */
public class Warga extends Penduduk{
    private String asal, bekerja, bernama;

    public Warga(String bekerja, String bernama) {
        asal = "Pribumi";
        this.bekerja = bekerja;
        this.bernama = bernama;
    }

    public String getBekerja() {
        return bekerja;
    }
    
    public String getNama(){
        return bernama;
    }
    
    String getAsal(){
       return asal;
    }
    
    
    
}

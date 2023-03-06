/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wilayah;

/**
 *
 * @author Bahruddin Farid
 */
public class Turis extends Penduduk{
    private String asal, bekerja, bernama;

    public Turis(String bekerja,String bernama) {
        asal = "non pribumi";
        this.bekerja = bekerja;
        this.bernama = bernama;
    }

    public String getBekerja() {
        return bekerja;
    }
    
    public String getNama() {
        return bernama;
    }
    
    String getAsal(){
       return asal;
    }
    
    
}

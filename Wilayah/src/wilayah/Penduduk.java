/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wilayah;

/**
 *
 * @author Bahruddin Farid
 */
public abstract class Penduduk {
    String nama;
    
    public void setNama(){
        this.nama = nama;
    } 

    public String getNama() {
        return nama;
    }
    
    abstract String getAsal();
    abstract String getBekerja();
}

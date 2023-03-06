/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wilayah;
/* DESKRIPSI SOAL
Buatlah minimal 3 kelas yang mengimplementasikan polymorphism, 
dilengkapi dengan minimal 1 kelas abstract dan 1 interface. Method yang dioverride 
minimal 3 method per superclassnya / interface yang diimplements.  Jumlah total kelas minimal 5 kelas. 
Implementasikan juga exception pada program yang kalian buat. 
Upload proyek kalian di github masing-masing lalu buat video demo dari tugas kalian dan upload di internet.
Kumpulkan link github dan link video demo.
*/

/*
kelas abstrack didapat dengan mengisi nilainya dengan diisi oleh kelas turunanya (override)
kelas interface didapat dengan ciri adanya implements 
polymorphism adalah membuat objek dalam kelas yang sama
*/


/**
 *
 * @author Bahruddin Farid
 */
public class Wilayah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Selamat datang di Desa Turi");
        System.out.println("Awali pagi dengan senyum-senyum sendiri :\"");
        System.out.println("Berikut adalah data survey terkini");
        
        Penduduk terkini[] = new Penduduk[5];
        terkini[0] = new Warga("Ibu Rumah Tangga", "Sudaryanti");
        terkini[1] = new Warga("Tukang", "Papaiyo");
        terkini[2] = new Warga("Programmer","Ikaeda");
        terkini[3] = new Turis("Jaga hotel","Maguaire");
        terkini[4] = new Turis("Pelayan","Maiden");
        
        Bangunan terbaru[] = new Bangunan[3];
        Hotel satu = new Hotel(13,12,4,"Perusahaan");
        Rumah dua = new Rumah(12,14,2,"Bersama");
        Rumah tiga = new Rumah(15,13,1,"Pribadi");
        
        System.out.println("\nData ke-1");
        System.out.println("Jenis Bangunan " + satu.jnsBangunan() + " status kepemilikan " + satu.kepemilikanLahan());
        System.out.println("Luas lahan " + satu.hitungLuas() + " kapasitas " + satu.hitungOrang()+ " orang");
        System.out.println("Nama Pemilik : " + terkini[3].getNama() + " asal " + terkini[3].getAsal() + " pekerjaan " + terkini[3].getBekerja());
        System.out.println("Nama Pelayan : " + terkini[4].getNama() + " asal " + terkini[4].getAsal() + " pekerjaan " + terkini[4].getBekerja());
        
        System.out.println("Data ke-2");
        System.out.println("Jenis Bangunan " + dua.jnsBangunan() + " status kepemilikan " + dua.kepemilikanLahan());
        System.out.println("Luas lahan " + dua.hitungLuas() + " kapasitas " + dua.hitungOrang()+ " orang");
        System.out.println("Nama Pemilik : " + terkini[1].getNama() + " asal " + terkini[1].getAsal() + " pekerjaan " + terkini[1].getBekerja());
        System.out.println("Nama Anggota : " + terkini[0].getNama() + " asal " + terkini[0].getAsal() + " pekerjaan " + terkini[0].getBekerja());
        
        System.out.println("Data ke-3");
        System.out.println("Jenis Bangunan " + tiga.jnsBangunan() + " status kepemilikan " + tiga.kepemilikanLahan());
        System.out.println("Luas lahan " + tiga.hitungLuas() + " kapasitas " + tiga.hitungOrang()+ " orang");
        System.out.println("Nama Pemilik : " + terkini[2].getNama() + " asal " + terkini[2].getAsal() + " pekerjaan " + terkini[2].getBekerja());
    }
    
}

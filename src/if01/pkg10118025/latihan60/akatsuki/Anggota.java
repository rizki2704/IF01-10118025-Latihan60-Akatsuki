/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan60.akatsuki;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Anggota extends Akatsuki{
     private final String nama;
    private final String asal;
    private final String senjata;
    private final String kemampuan;
    private final String cincin;
    private final String partner;
    private final String status;

    public Anggota(String nama, String asal, String senjata, String kemampuan, String cincin, String partner, String status, String tujuan, String outfit, String pemimpin, String caraKerja) {
        super(tujuan, outfit, pemimpin, caraKerja);
        this.nama = nama;
        this.asal = asal;
        this.senjata = senjata;
        this.kemampuan = kemampuan;
        this.cincin = cincin;
        this.partner = partner;
        this.status = status;
    }
    
    public void tampilAnggota(){        
        System.out.printf("Nama\t\t\t: %s%n",nama);
        System.out.printf("Asal\t\t\t: %s%n",asal);
        System.out.printf("Senjata\t\t\t: %s%n",senjata);
        System.out.printf("Kemampuan Khusus\t: %s%n",kemampuan);
        System.out.printf("Cincin\t\t\t: %s%n",cincin);
        System.out.printf("Partner\t\t\t: %s%n",partner);
        System.out.printf("Status\t\t\t: %s%n%n",status);
    }
}

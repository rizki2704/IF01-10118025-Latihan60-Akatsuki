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
public class Akatsuki {
     private final String tujuan;
    private final String outfit;
    private final String pemimpin;
    private final String caraKerja;

    public String getTujuan() {
        return tujuan;
    }

    public String getOutfit() {
        return outfit;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public String getCaraKerja() {
        return caraKerja;
    }

    public Akatsuki(String tujuan, String outfit, String pemimpin, String caraKerja) {
        this.tujuan = tujuan;
        this.outfit = outfit;
        this.pemimpin = pemimpin;
        this.caraKerja = caraKerja;
    }
    
    public void tampilAkatsuki(){
        System.out.println("------Akatsuki------");
        System.out.printf("Pemimpin\t: %s%n",pemimpin);
        System.out.printf("Tujuan\t\t: %s%n",tujuan);
        System.out.printf("Outfit\t\t: %s%n",outfit);
        System.out.printf("Cara Kerja\t: %s%n",caraKerja);
    }
}

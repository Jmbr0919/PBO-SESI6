//Muhamad Jembar Fadillah
//TI21F
//20210040149
package Sesi6No1;

/**
 *
 * @author jembar
 */
public class Main {
    public static void main(String[] args) {
        
        BangunDatar segitiga = new SegiTiga(12,20);
        BangunDatar lingkaran = new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar lingkaran : " + lingkaran.getLuas());
    }
}

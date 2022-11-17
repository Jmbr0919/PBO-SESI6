//Muhamad Jembar Fadillah
//TI21F
//20210040149

package Sesi6No1;

/**
 *
 * @author jembar
 */
public class SegiTiga extends BangunDatar {
     private float alas;
    private float tinggi;
    
    public SegiTiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float getLuas() {
        return (float) 0.5 * alas * tinggi;
    }
     
}

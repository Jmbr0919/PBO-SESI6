//Muhamad Jembar Fadillah
//TI21F
//20210040149

package Sesi6No1;

/**
 *
 * @author jembar
 */
public class Lingkaran extends BangunDatar {
     float jari_jari;
    
    public Lingkaran(float jari_jari) {
        this.jari_jari = jari_jari;
    }

    @Override
    float getLuas() {
        return (float) Math.PI * jari_jari * jari_jari;
    }
}

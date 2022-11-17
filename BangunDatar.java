//Muhamad Jembar Fadillah
//TI21F
//20210040149

package Sesi6No1;

/**
 *
 * @author jembar
 */
public abstract class BangunDatar {
     String warna;
    
    String getwarna() {
        return warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    abstract float getLuas();
}


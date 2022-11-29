package OOP.Bidang.duadimensi;

import OOP.Bidang.isibidang;

public class Lingkaran extends isibidang {
    public static void setLuas(){
        luas2 = 3.14 * Math.pow(getJari(),2);
    }

    public static double getLuas(){
        return luas2;
    }
}

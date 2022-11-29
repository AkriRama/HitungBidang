package OOP.Bidang.duadimensi;

import OOP.Bidang.isibidang;

public class Segitiga extends isibidang {

    public static void setLuas(){
        luas2 = (getAlas() * getTinggi())/2;
    }

    public static double getLuas(){

        return luas2;
    }
}

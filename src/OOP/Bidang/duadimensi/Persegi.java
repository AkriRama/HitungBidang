package OOP.Bidang.duadimensi;

import OOP.Bidang.isibidang;

public class Persegi extends isibidang {

    public static void setLuas(){
        luas = (int) Math.pow(getSisi(),2);
    }

    public static int getLuas(){
        return luas;
    }
}

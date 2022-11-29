package OOP.Bidang.duadimensi;

import OOP.Bidang.isibidang;

public class PersegiPanjang extends isibidang {

    public static void setLuas(){
        luas = getPanjang() * getLebar();
    }

    public static int getLuas(){
        return luas;
    }
}

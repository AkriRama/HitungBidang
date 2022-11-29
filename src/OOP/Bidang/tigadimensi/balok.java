package OOP.Bidang.tigadimensi;

import OOP.Bidang.isibidang;

public class balok extends isibidang {

    public static void setVolume(){
        volume = getPanjang() * getLebar() * getTinggi();
    }

    public static int getVolume(){
        return volume;
    }



}

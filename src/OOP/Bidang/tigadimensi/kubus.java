package OOP.Bidang.tigadimensi;

import OOP.Bidang.isibidang;

public class kubus extends isibidang {

    public static void setVolume(){
        volume = (int) Math.pow(getSisi(), 3);
    }

    public static int getVolume(){
        return volume;
    }

}


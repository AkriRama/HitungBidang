package OOP.Bidang.tigadimensi;

import OOP.Bidang.isibidang;

public class tabung extends isibidang {
    public static void setVolume(){volume2 = 3.14 * getTinggi() * Math.pow(getJari(),2);
    }

    public static double getVolume(){
        return volume2;
    }
}

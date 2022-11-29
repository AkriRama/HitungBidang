package OOP.Bidang;

import OOP.Bidang.tigadimensi.balok;
import OOP.Bidang.tigadimensi.kubus;
import OOP.Bidang.tigadimensi.tabung;
import static OOP.processing.*;

public class volume {
    public static void volumebidang(int novolume){
        kubus k = new kubus();
        tabung t = new tabung();
        balok b = new balok();

        switch (novolume){
            case 1 :
                k.setVolume();
                System.out.println(k.getVolume());
                break;
            case 2 :
                t.setVolume();
                System.out.println(t.getVolume());
                break;
            case 3 :
                b.setVolume();
                System.out.println(b.getVolume());
                break;
            default:
        }
    }
}

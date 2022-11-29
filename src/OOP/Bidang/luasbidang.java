package OOP.Bidang;


import OOP.Bidang.duadimensi.Lingkaran;
import OOP.Bidang.duadimensi.Persegi;
import OOP.Bidang.duadimensi.PersegiPanjang;
import OOP.Bidang.duadimensi.Segitiga;

public class luasbidang {

    static int sisi, tinggi, panjang, lebar;
    static double jari, alas;

    public static void luas(int nobidang){
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        Segitiga s = new Segitiga();
        PersegiPanjang pp = new PersegiPanjang();

        switch (nobidang){
            case 1 :
                p.setLuas();
                System.out.println(p.getLuas());
                break;
            case 2 :
                l.setLuas();
                System.out.println(l.getLuas());
                break;
            case 3 :
                s.setLuas();
                System.out.println(s.getLuas());
                break;
            case 4 :
                pp.setLuas();
                System.out.println(pp.getLuas());
                break;
            default:
        }
    }
}

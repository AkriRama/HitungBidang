package OOP;


import OOP.Bidang.isibidang;

import java.util.Scanner;

import static OOP.Bidang.luasbidang.luas;
import static OOP.menu.input;
import static OOP.Bidang.volume.volumebidang;

public class processing extends isibidang {

    private static Scanner in = new Scanner(System.in);
    private static int sisi, tinggi, panjang, lebar;
    private static double jari, alas;

    public static void process(int nobidang, int input){
        System.out.println("-------------------------------------\n"
                + "Anda Memilih "+bidang(nobidang,input));
        isibidang(nobidang,input);
        System.out.println("processing...");
        System.out.print("Luas dari "+bidang(nobidang,input)+" adalah ");
        result(input, nobidang);
        System.out.println("");
        System.out.println("-------------------------------------\n"
                + "tekan apa saja untuk kembali");
        char asal = in.next().charAt(0);
        menu.menu(true);
    }

    private static String bidang(int nobidang, int input){
        String bidang = "";

        if (input == 1){
            switch(nobidang){
                case 1 :
                    bidang = "Persegi";
                    break;
                case 2 :
                    bidang = "Lingkaran";
                    break;
                case 3 :
                    bidang = "Segitiga";
                    break;
                case 4 :
                    bidang = "Persegi Panjang";
                    break;
                default:
            }
        }
        else if (input == 2){
            switch(nobidang){
                case 1 :
                    bidang = "Kubus";
                    break;
                case 2 :
                    bidang = "Tabung";
                    break;
                case 3 :
                    bidang = "Balok";
                    break;
                default:
            }
        }
        return bidang;
    }

    private static int isibidang(int nobidang, int input){

        if (input == 1){

            switch(nobidang){
                case 1 :
                    System.out.print("Masukan Sisi\t: ");
                    sisi = in.nextInt();
                    setSisi(sisi);
                    break;
                case 2 :
                    System.out.print("Masukan Jari-Jari\t: ");
                    jari = in.nextDouble();
                    setJari(jari);
                    break;
                case 3 :
                    System.out.print("Masukan Alas\t: ");
                    alas = in.nextDouble();
                    System.out.print("Masukan Tinggi\t: ");
                    tinggi = in.nextInt();
                    setAlas(alas);
                    setTinggi(tinggi);
                    break;
                case 4 :
                    System.out.print("Masukan Panjang\t: ");
                    panjang = in.nextInt();
                    System.out.print("Masukan Lebar\t: ");
                    lebar = in.nextInt();
                    setPanjang(panjang);
                    setLebar(lebar);
                    break;
                default:
            }
        }

        else if (input == 2){

            switch(nobidang){
                case 1 :
                    System.out.print("Masukan Sisi\t: ");
                    sisi = in.nextInt();
                    setSisi(sisi);
                    break;
                case 2 :
                    System.out.print("Masukan Tinggi\t: ");
                    tinggi = in.nextInt();
                    System.out.print("Masukan Jari-Jari\t: ");
                    jari = in.nextDouble();
                    setTinggi(tinggi);
                    setJari(jari);
                    break;
                case 3 :
                    System.out.print("Masukan Panjang\t: ");
                    panjang = in.nextInt();
                    System.out.print("Masukan Lebar\t: ");
                    lebar = in.nextInt();
                    System.out.print("Masukan Tinggi\t: ");
                    tinggi = in.nextInt();
                    setPanjang(panjang);
                    setLebar(lebar);
                    setTinggi(tinggi);
                    break;
                default:
            }
        }
        return nobidang;
    }

    private static void result(int input, int nobidang){
        switch (input){
            case 1 :
                luas(nobidang);
                break;
            case 2 :
                volumebidang(nobidang);
                break;
            default:
        }
    }
}

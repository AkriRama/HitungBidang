package OOP;

import java.util.Scanner;

import static OOP.processing.process;

public class menu {

    public static int input;
    public static void menu(boolean menu){

        Scanner in = new Scanner(System.in);
        int ulang = 0;

        while(menu){
            System.out.println("-------------------------------------\n"
                    + "Kalkulator Penghitung Luas dan Volume\n"
                    + "-------------------------------------\n"
                    + "Menu\n"
                    + "1. Hitung Luas Bidang\n"
                    + "2. Hitung Volume\n"
                    + "0. Tutup Aplikasi");
            System.out.println("-------------------------------------");

            input = in.nextInt();

            if(input == 1){
                System.out.println("-------------------------------------\n"
                        + "Pilih bidang yang akan dihitung\n"
                        + "-------------------------------------");
                System.out.println("1. Persegi\n"
                        + "2. Lingkaran\n"
                        + "3. Segitiga\n"
                        + "4. Persegi Panjang\n"
                        + "0. Kembali ke menu sebelumnya");
                System.out.println("-------------------------------------");

                int choose = in.nextInt();
                if (choose == 0){
                    menu(true);
                }
                else if (choose > 1 && choose <= 3){
                    process(choose,input);
                }
                else{
                    System.out.println("Pilihan yang anda masukan salah!");
                }
            }
            else if(input == 2){
                System.out.println("-------------------------------------\n"
                        + "Pilih bidang yang akan dihitung\n"
                        + "-------------------------------------");
                System.out.println("1. Kubus\n"
                        + "2. Tabung\n"
                        + "3. Balok\n"
                        + "0. Kembali ke menu sebelumnya");
                System.out.println("-------------------------------------");

                int choose = in.nextInt();
                if (choose == 0){
                    menu(true);
                }
                else if (choose > 1 && choose <= 3){
                    process(choose,input);
                }
                else{
                    System.out.println("Pilihan yang anda masukan salah!");
                }
            }
            else if(input == 0){
                menu = false;
            }else{
                if (ulang < 3){
                    System.out.println("Maaf kode yang anda masukan salah!\n" +
                            "Silahkan masukan kembali kode anda");
                }
                else if (ulang == 3){
                    System.out.println("Batas memasukan kode sudah mencapai batas\n" +
                            "Silahkan coba kembali dilain kesempatan");
                    menu = false;
                }
                ulang++;
            }

        }
    }
}

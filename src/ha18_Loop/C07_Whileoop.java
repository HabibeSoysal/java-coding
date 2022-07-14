package ha18_Loop;

import java.util.Scanner;

public class C07_Whileoop {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */
        int input = 689;
        int rakamlarToplam = 0;
        int birlerBasamagı = 0;
        int temt = input;

        while (temt > 0) {
            birlerBasamagı = temt % 10;
            rakamlarToplam += birlerBasamagı;
            temt /= 10;

        }
        System.out.println( input + " sayısının rakamlar toplamı:"+ rakamlarToplam);
    }

}

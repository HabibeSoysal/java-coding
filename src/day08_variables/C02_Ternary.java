package day08_variables;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alıp sayının mutlak degerini yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen   bir sayi yazınız : ");
        double sayi = scan.nextDouble();

            System.out.println(sayi>=0 ? sayi : (-1*sayi));




    }
}

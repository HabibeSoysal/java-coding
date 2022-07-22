package day08_variables;

import java.util.Scanner;

public class H01_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen   bir sayi yazınız : ");
        double sayi = scan.nextDouble();


        if (sayi>0){
            System.out.println(sayi);

        } else {
            System.out.print("Lütfen   bir sayi daha yazınız : ");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi*sayi2);
        }






    }
}

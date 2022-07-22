package day10_variables;

import java.util.Scanner;

public class C10_SwitchStatemen {
    public static void main(String[] args) {
        /*Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kacıncı gün old giriniz");
        int güno=scan.nextInt();

        switch(güno){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gün sayısı giriniz");


        }





    }
}

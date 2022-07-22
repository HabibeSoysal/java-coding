package day08_variables;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        /* kullanıcıdan gün no alıp 1 ise pazartesi....
        7 ise pazar yazdıralım
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen kacıncı gün oldugunhu yazınız : ");
        int güno=scan.nextInt();

        switch(güno){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("PAzar");
                break;
            default:
                System.out.println("Gecerli gün numarası giriniz");
            }

    }
}

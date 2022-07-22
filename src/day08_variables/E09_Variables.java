package day08_variables;

import java.util.Scanner;

public class E09_Variables {
    public static void main(String[] args) {
        //Kullanıcı yapcagı işlem sembolunu seciniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Yapacagınız 4 işlemi *+-/ olarak  seciniz : ");
        char işlem=scan.next().charAt(0);

        System.out.println("1. sayı " );
        double sayi1 = scan.nextDouble();
        System.out.println("2. sayi" );
        double sayi2 = scan.nextDouble();


    }
}

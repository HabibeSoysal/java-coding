package E02_practice;

import java.util.Locale;
import java.util.Scanner;

public class E01_StringManipulatıon {
    public static void main(String[] args) {


    /*
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminiz ve soyisminizi giriniz");
        String firstName=scan.nextLine(), lastName=scan.nextLine();//multıple declaratıon
        String fullNAme=firstName.concat(" "+ lastName).toUpperCase();
        System.out.println("fullNAme = " + fullNAme);

    }

}

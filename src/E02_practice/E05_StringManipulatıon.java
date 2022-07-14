package E02_practice;

import java.util.Scanner;

public class E05_StringManipulatıon {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cümle oluşturmak için 1. kelimeyi giriniz");
        String a=scan.next();

        System.out.println("Lütfen cümle oluşturmak için 2. kelimeyi giriniz");
        String b=scan.next();
        System.out.println("Lütfen cümle oluşturmak için 3. kelimeyi giriniz");
        String c=scan.next();
        System.out.println("Lütfen cümle oluşturmak için 4. kelimeyi giriniz");
        String d=scan.next();

        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+
        " " + b+ " " + c + " " + d + " ");












    }
}

package h12_variables;

import java.util.Scanner;

public class H13_S {
    public static void main(String[] args) {
        /*
        Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin uzun keneraını giriniz");
        int a= scan.nextInt();
        System.out.println("Dikdörtgenin kısa kenarını giriniz");
        int b=scan.nextInt();

        if (a==b){
            System.out.println("Bu dikdörtgen bir Karedir");
        }else{
            System.out.println("Bu dikdörtgen KAre Değildir");
        }

    }
}

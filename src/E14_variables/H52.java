package E14_variables;

import java.util.Scanner;

public class H52 {
    public static void main(String[] args) {
        /*
Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz");
        double not = scan.nextDouble();

        if (not<=0 || not>=100) {
            System.out.println("100 üzerinden Geçerli not girişi yapınız");
        } else if (not>80) {
            System.out.println("A");
        } else if (not>60) {
            System.out.println("B");
        } else if (not>50) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }


    }
}

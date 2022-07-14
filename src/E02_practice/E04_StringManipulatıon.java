package E02_practice;

import java.util.Scanner;

public class E04_StringManipulatıon {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir string giriniz");
        String str=scan.nextLine();

        if (str.length()>=3){
            System.out.println(str.substring(1)+str.substring(1)+str.substring(1));
        }else {
            System.out.println("str");
        }
//str.length()-2 olarak son 2 karakter olarakta yapılabilir




    }
}

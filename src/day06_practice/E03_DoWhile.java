package day06_practice;

import java.util.Scanner;

public class C03_DoWhile {
    public static void main(String[] args) {
        /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

        Scanner scan = new Scanner(System.in);
        String kelime = "";
        do {
            System.out.println("lütfen bir harf giriniz");
            kelime = scan.next();
            System.out.println("program çalışıyor");
        } while (kelime.equalsIgnoreCase("x"));
        System.out.println("program bitti");

    }

}


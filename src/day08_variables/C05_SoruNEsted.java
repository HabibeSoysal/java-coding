package day08_variables;

import java.util.Scanner;

public class C05_SoruNEsted {
    public static void main(String[] args) {
        /*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
         Girdiği sayi 5’ebölünüyorsa son rakamını kontrol edin.
         Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
          Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 4 basamaklı bir sayi yazınız : ");
        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lütfen 4 bas bir sayı giriniz");

        }else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5 e bölünen Çifttir");
            } else {
                System.out.println("5 e Bölünen tek sayı");
            }
        }else{
            System.out.println("Tekrar deneyin");

        }

    }
}
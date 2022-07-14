package h21_calışmalar;

import java.util.Scanner;

public class H03_StringManipulatıon {
    public static void main(String[] args) {


    /*
    Kullanicidan email adresini girmesini isteyin, mail @gmail.com
icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa “Email adresiniz
kaydedildi “
, @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen email adresini  giriniz");
        String email = scan.nextLine();


        if (!email.contains("@gmail.com")) {
            System.out.println("lütfen gmail adresini giriniz");
        } else if (email.lastIndexOf("@gmail.com") == (email.length()-10)) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lütfen yazımı kontrol edin");}
    }





}



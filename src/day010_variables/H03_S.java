package day010_variables;

import java.util.Scanner;

public class H03_S {
    public static void main(String[] args) {
        /*
        Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com
icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa “Email adresiniz
kaydedildi “
, @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen emailinizi giriniz");
        String email=scan.nextLine();
        
        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen @gmail.com adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("email adresiniz kydedildi");
        }else {
            System.out.println("Lütfen yazımı kontrol edin");
        }


    }
}

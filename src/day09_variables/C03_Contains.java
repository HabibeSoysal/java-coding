package day09_variables;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa ''lutfen gmail adresi giriniz", @gmail.com ile bitiyorsa \n
        "Email adresiniz kaydedildi .. , @gmail.com ile bitmiyorsa lutfen yazimi kental edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen email adresini giriniz");
        String email=scan.nextLine();

        if(!email.contains("@gmail")){
            System.out.println("Lütfen gmail adresini giriniz");
        } else if(email.lastIndexOf("@gmail.com")==(email.length()-10) ){
            System.out.println("email adresiniz kaydedildi");

        }else {
            System.out.println("Lütfen yazimi kontrol edin");
        }






    }
}

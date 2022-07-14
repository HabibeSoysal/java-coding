package E14_variables;

import java.util.Scanner;

public class H86__J {
    public static void main(String[] args) {
        /*Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
       double yas= scan.nextDouble();

       if (yas<0 || yas>100) {
           System.out.println("Anormal giriş");
       } else if (yas>=65) {
           System.out.println("Emekli olabilirsin");
       }else{
            System.out.println("emekli olamazsın");
        }

    }
}

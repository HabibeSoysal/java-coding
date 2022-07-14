package h12_variables;

import java.util.Scanner;

public class H03_V {
    public static void main(String[] args) {
        /*Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
gecerli degilse “Gecerli gun ismi giriniz” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gün=scan.next();
        
        if (gün.startsWith("Paz")){
            System.out.println("Geçerli gün");
        } else if (gün.equals("Sal")) {
            System.out.println("Geçerli gün");
            
        } else if (gün.equals("Car")) {
            System.out.println("Geçerli gün");

        } else if (gün.equals("Per")) {
            System.out.println("Geçerli gün");

        }else if (gün.equals("Cum")){
            System.out.println("Geçerli gün");
        }else{
            System.out.println("Geçerli gün ismi yazınız");
        }


    }
}

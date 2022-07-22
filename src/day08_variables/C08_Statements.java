package day08_variables;

import java.util.Locale;
import java.util.Scanner;

public class C08_Statements {
        public static void main(String[] args) {
        /*Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
        isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        gecerli degilse &ldquo;Gecerli gun ismi giriniz&rdquo; yazdirin

        */
        Scanner scan=new Scanner(System.in);
            System.out.print("Lütfen bi gün ismi yazınız : ");
            String gün=scan.nextLine().toLowerCase();

            if (gün.equals("pazartesi") || gün.equals("pazar")){
                System.out.println("Paz");
            } else if (gün.equals("sali")){
                System.out.println("Sal");
            } else if (gün.equals("carsamba")) {
                System.out.println("Car");
            }else if (gün.equals("persembe")){
                System.out.println("Per");
            }else if (gün.equals("cuma") || gün.equals("cumartesi")){
                System.out.println("Cum");
            }else{
                System.out.println("Lütfen geçerli bir gün ismi giriniz");
            }




        }
}

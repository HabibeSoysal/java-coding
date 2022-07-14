package h12_variables;

import java.util.Scanner;

public class H06ıjahs {
    public static void main(String[] args) {
        /*
         Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
60 – 80.000 arasinda ise “Konusabiliriz”,
60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen maaş önerisini belirtiniz");
        double maas=scan.nextDouble();

        if (maas>80){
            System.out.println("kabul ediyorum");
        } else if (maas > 60) {
            System.out.println("Konusabilirz");
        }else{
            System.out.println("Maalesef kabul edemem");
        }




    }
}

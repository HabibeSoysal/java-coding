package h12_variables;

import java.util.Scanner;

public class H1If {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi1=scan.nextInt();

        if (sayi1%2==0){
            System.out.println("Girilen sayı cift sayıdır");
        }else {
            System.out.println("Girilen sayi tektir");
        }

    }
}

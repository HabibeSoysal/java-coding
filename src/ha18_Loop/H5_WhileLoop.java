package ha18_Loop;

import java.util.Scanner;

public class H5_WhileLoop {
    public static void main(String[] args) {
        /*
        ) Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
yazdirin. Kullanicinin hata yapmadigini farz edin.
Ornegin kullanici 3 girerse;
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bi rakam giriniz");
        int rakam = scan.nextInt();

        for (int i =rakam; i <=rakam; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(i +"x"+ j + "=" + i * j + " ");
            }
            System.out.print(" ");
        }

    }

}

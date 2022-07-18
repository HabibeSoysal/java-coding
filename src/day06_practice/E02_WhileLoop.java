package day06_practice;

import java.util.Scanner;
public class E02_WhileLoop {
        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)
        */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("lütfen bir sayı giriniz");
            int sayı = scan.nextInt();
            int count = 0;
            while (sayı > 0) {
                if (sayı % 2 == 1)
                    System.out.println(sayı);
                count++;

            }
            sayı--;
            System.out.println("count = " + count);
        }
}


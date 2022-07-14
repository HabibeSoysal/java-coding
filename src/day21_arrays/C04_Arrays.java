package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir array’in boyutunu ve
        tum elementlerini alarak bir array olusturup, bu array’i bize donduren bir method olusturun
         */
        int [] sayilar=arrayOluştur();
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayOluştur() {

        Scanner scan=new Scanner(System.in);
        System.out.println("kaç elemanlı bir array oluşturmamı istersiniz");
        int uzunluk=scan.nextInt();
        int[]oluşturulan=new int[uzunluk];

        int sayi=0;
        for (int i = 0; i <uzunluk; i++) {
            System.out.println(i + ". index için sayı giriniz");
            oluşturulan[i]=scan.nextInt();
        }



        return oluşturulan;



    }
}

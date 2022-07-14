package h12_variables;

import java.util.Scanner;

public class E12_YolHızZaman {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi(km) girini");
        double mesafe= scan.nextDouble();

        System.out.println("Lütfen ortalama hızınızı(km/saat) giriniz");
        double hız= scan.nextDouble();


        double varıs_suresi= mesafe/hız;
        System.out.println("varıs_suresi= " + varıs_suresi);

        scan.close();






    }
}

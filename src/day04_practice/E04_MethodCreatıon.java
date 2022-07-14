package day04_practice;

public class E04_MethodCreatıon {
    public static void main(String[] args) {
/*
    100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
    Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
    istenen sonuc :
     91
     78
     65
     52
     39
     26
     13       */

        int start = 100, bit = 0;
        int sum = 0, sayac = 0;

        for (int i = 100; i >= 1; i--) {
            if (i % 13 == 0) {
                sum += i;
                sayac++;
                System.out.print(i + " ");


            }
        }
        System.out.println("");
        System.out.print(sayac + " adet 13 e bölünen sayı vardır ve bunların toplamları : " + sum);


    }
}

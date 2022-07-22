package day03_scanner;

public class C05_PrePostIcrement {
    public static void main(String[] args) {

        int sayi1=10;


        int sayi2=sayi1+1;//sayi2--11

        sayi2+=5;// "sayi2--- 16
        /*Pre veya pot increment veya decrement sadece ++ ve -- işlemi için geçerlidir
        Bu iki işlem sayıdan sonra veya önce yazılmasına göre farlı ii işlem gerçekleşirir.

         */

        int sayi3=sayi2++;//1. sayı2 1artırılacak
                          // 2. yı2 degeri, sayi 3 e atanacak

        int sayi4=++ sayi1;// sayı1 1 artırılacak
                           //sayı degeri, sayı 4 e atanacak


    }
}

package day09_variables;

import java.util.Scanner;

public class H01_S {
    public static void main(String[] args) {
        //Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdiri

        int a=30;
        char b='7';

        System.out.println("sayıların toplamı:"+(a+b));


        System.out.println(" ");
        int num1=5, num2=96;
        num2=5;
        num1=96;
        System.out.println(num2);
        System.out.println(num1);
    /*
    Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
Isminiz : Mehmet
Soyisminiz : Bulut
Kursumuza katiliminiz alinmistir,tesekkur ederiz
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
       String isim=scan.nextLine();
       String soyisim=scan.nextLine();

       System.out.println("isminiz :" + isim);
        System.out.println("soyisminiz :" + soyisim);

/*  ) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
sekilde yazdirin
Isim – soyisim : Mehmet Bulutluoz

 */
        System.out.println("Lütfen isminizi ve soyisminizi aralarında boşluk bırakacak sekilde giriniz");
        String ad=scan.nextLine();
        String soyad=scan.nextLine();

        System.out.println("İsim "+ " - " +" Soyisim : " + ad + soyad);

        //Kullanicidan ismini alip isminin bas harfini yazdiri

        System.out.println("Lütfen isminizi girini");
        char ilkharf=scan.next().charAt(0);
        System.out.println(ilkharf);



    }
}

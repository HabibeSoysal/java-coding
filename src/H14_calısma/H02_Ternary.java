package H14_calısma;

import java.util.Scanner;

public class H02_Ternary {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdiri


        int a=6;
        int b=85;
        System.out.println(a>b?a:b);//b

//Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

       int c=66;
        System.out.println( c/2==0 ?("tek"):("cift"));


//Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdiri

        double d=64.55;
        System.out.println(-1*d);
/*
Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
sayinin karesini yazdirin

 */
        double x=46.652;
        System.out.println(x>0?"Sayı pozitif":"sayı negatif");

/*
: Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den kucukse “iki
basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int num=scan.nextInt();

        if (num<0){
            System.out.println("Rakam");
        } else if (num<100) {
            System.out.println( "iki basamaklı sayi");
        }else{
            System.out.println("üc basamaklı ve daha büyük say");
        }
/*
: Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
 */

        System.out.println("Lütfen bir harf  giriniz");
        char harf=scan.next().charAt(0);

        if (harf<='A' && num>='Z'){
            System.out.println("Büyük harf");
        } else if (harf<='a' && harf>='z') {
            System.out.println("küçük harf");
        }else{
            System.out.println("girdiginiz karakter harf degil");
        }
/*
 Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere
gore dikdorgenin kare olup olmadigini yazdirin.
 */

        System.out.println("Lütfen dikdörtgenin genişliğini  giriniz");
        double gen=scan.nextDouble();
        System.out.println("Lütfen dikdörtgenin uzunluğunu  giriniz");
        double uzun=scan.nextDouble();


        System.out.println( uzun==gen?"KAredir":"kare değildir");
/*
Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa “Uc
basamakli degil” yazdiri
 */
        System.out.println("Lütfen pozitif bir tamsayı  giriniz");
        int y=scan.nextInt();
        System.out.println(y>100||y<1000?"3 basamaklı": "3 basamaklı değil");
    }
}

package day13_variables;

import java.util.Scanner;

public class C05_MethodCreatıonReturn {

    public static void main(String[] args) {
        /*
        kullanıcıdan sehir isimini ve doğum tarihini alıp bunları programda
        kullanacagımız formatta bize döndüren bir method olusturun  sehir ismini programımızda büyük harf oalrak,
        tarihi ise 2022-06-30 seklinde kullanmak istiyoruz
         */
        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("Girdiğiniz sehir : " + sehir);
        System.out.println("Girdiğiniz tarih : " + tarih);
    }
    public static String tarihAl() {
        String tarih=" ";
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil=scan.nextInt();

        if (yil>1900 && yil<2100){
            tarih=yil+"-";
        }else{
            System.out.println("yil için geçerli bir sayi yazmalısınız(1900-2100)");
        }

        System.out.println("kaçıncı ay olduğunu tamsayı olarak yazınız");
        int ay=scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasında olmalıdır");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else{
            tarih=tarih+ay+"-";
        }
        System.out.println("Lütfen ayın kacıncı günü olduğunu tamsayı olarak giriniz");

        int gün=scan.nextInt();
        if (gün<=0 || gün>31){
            System.out.println("gün no olarak 1-31 arasında sayi girilmelidir");
        } else if (gün<10 ) {
            tarih=tarih+"0"+gün ;
        }else{
            tarih=tarih+gün;
        }
        return tarih;

    }
    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen şehir adı giriniz");
        String sehirAdı=scan.next().toUpperCase();
        return sehirAdı;

    }


}

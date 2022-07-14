package E02_practice;

import java.util.Scanner;

public class E02_StringManipulatıon {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve
        //bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve
        //ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tane String  degeri giriniz");
        String str1=scan.nextLine(), str2=scan.nextLine();

        System.out.println("1. yöntem :" + "" + str1+""+ str2);
        System.out.println("2.yöntem:" +str1.concat(" "+str2));

        String str1Al=str1.substring(1);
        String str2Al=str2.substring(1);

        System.out.println("Manipulatıon dan sonraki hali:" + str1Al + " " + str2Al);


    }
}

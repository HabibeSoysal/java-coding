package day08_variables;

import java.util.Scanner;

public class C04_TernaryNested {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir harf yazınız : ");
        char harf=scan.next().charAt(0);

        String sonuc=(harf>='a' && harf<='z') ?("Küçük harf") :
                ((harf>='A' && harf<='Z')?"Büyük harf":"Geçersiz karakter");

        String sonuc1=(harf>='a' && harf<='z') ?("Küçük harf") :
                ((harf>='A' && harf<='Z')?"Büyük harf":"Geçersiz karakter");
        System.out.println(sonuc1);
        System.out.println(sonuc);








    }
}

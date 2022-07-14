package H14_calısma;

import java.util.Scanner;

public class H01_NestedIf {
    public static void main(String[] args) {
        /*
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifre giriniz");
        String sifre = scan.nextLine();

        char ilkHarf = sifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf == 'A') {
                System.out.println("Geçerli sifre");
            } else {
                System.out.println("Geçersiz sifre");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z'){
            if (ilkHarf=='z'){
                System.out.println("GEçerli sifre");
            } else {
                System.out.println("Geçersiz sifre");
            }
       }else    {
                System.out.println("İlk karakter için sadcee harf kullanın");
            }
        }
    }

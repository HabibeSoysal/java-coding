package day010_variables;

import java.util.Scanner;

public class H11_S4 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bi isim  ve soyisim giriniz");
        String isim=scan.nextLine();
        String  soy=scan.nextLine();

        System.out.println(isim.length());
        System.out.println(soy.length());

        if(isim.length()>soy.length()){
            System.out.println("Girdiğiniz isim daha uzun");
        }else if (isim.length()<soy.length()){
            System.out.println("Girdiğiniz soyisim daha uzun");
        }else{
            System.out.println("Uzunlukları eşittir");
        }



    }
}

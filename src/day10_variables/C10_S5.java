package day10_variables;

import java.util.Scanner;

public class C10_S5 {
    public static void main(String[] args) {
    //Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen günlerden birini yazınız");
        String input=scan.next().toLowerCase();

        switch(input){
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
            System.out.println("HAftaiçi");
            break;

            case "cumartesi":
            case "pazar":
            System.out.println("Haftasonu");
            break;
       default:
           System.out.println("Yanlış giriş");

        }

    }
}

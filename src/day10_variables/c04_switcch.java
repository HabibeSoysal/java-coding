package day10_variables;

import java.util.Scanner;

public class c04_switcch {
    public static void main(String[] args) {
        /*
        Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        Kullanici S girerse “Software”
        D girerse “Developer”
        E girerse “Engineer”
        T girerse “In Testing” yazdirin
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen SDET harfelerinden birini yazınız");
        char harf=scan.next().toUpperCase().charAt(0);

        switch(harf){
            case 'D':
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("In Testing");
                break;

            default:
                System.out.println("Yanlış giriş");

        }

    }
}

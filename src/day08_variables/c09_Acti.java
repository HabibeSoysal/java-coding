package day08_variables;

import java.util.Scanner;

public class c09_Acti {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bi yıl yazınız : ");
        int yıl=scan.nextInt();

        if (yıl%4 !=0){
            System.out.println("Artık yıl değil");
        } else if (yıl%100!=0){
            System.out.println("Artık yıl");
        } else if (yıl%400!=0){
            System.out.println("Artık yıl değil");
        }else{
            System.out.println("Artık yıl");
        }
    }
}

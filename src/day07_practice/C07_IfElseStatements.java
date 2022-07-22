package day07_practice;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yaş=scan.nextInt();

        if (yaş<65){
            System.out.println("emekli olamazsın,"+(65-yaş)+" yıl daha çalışmalısın");
        }else{
            System.out.println("emekli olabilirsin");
        }




    }
}

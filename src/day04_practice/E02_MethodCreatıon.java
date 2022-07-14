package day04_practice;

import java.util.Scanner;

public class E02_MethodCreatıon {
    public static void main(String[] args) {
        /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("metre ve km ye dönüştürmek isediğiiz cm degerini giriniz :");
        double cmValue=scan.nextDouble();

        convertCm(cmValue);
    }

    private static void convertCm(double cmValue) {
        double meter=cmValue/100;
        double km=cmValue/100000;
        System.out.println("girdiğiniz cm degeri :" + cmValue + " ," + meter + "metredir, " + km + "km'dir");

    }
}

package E14_variables;

import java.util.Scanner;

public class E14_BMISiniflama {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu  cm olarak giriniz");
        double boy=scan.nextDouble()/100;

        System.out.println("lütfen kilonuzu kg olarak giriniz");
        double kg= scan.nextDouble();
        // boyu metreye dönüştürdük

        double BMI= kg/(boy*boy);

        if (BMI<=20) {
            System.out.println("BMI indexiniz" +BMI+"oldukça zayıfsınız");
        } else if (BMI<=25) {
            System.out.println("BMI indexiniz" +BMI+"Normal sınırlardasınız");
        }else if (BMI<=30){
            System.out.println("BMI indexiniz" +BMI+"Şişman kategoridesiniz");
        }else {
            System.out.println("BMI indexiniz" +BMI+ "Obez grubundasınız");
        }



    }
}

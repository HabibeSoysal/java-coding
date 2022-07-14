package E14_variables;

import java.util.Scanner;

public class E14_KanBagısı {
    public static void main(String[] args) {
        /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
       int yas =scan.nextInt();

        System.out.println("lütfen kilonuzu kg olarak giriniz");
        int  kg= scan.nextInt();


        if (yas>0 && yas<18){
            System.out.println("Kan bağısı yapamazsınız");
        }else if (yas>=18){
            if(kg>0 && kg<50){
                System.out.println("kilonuz 50 den küçük olduğu için kan bağısı yapamazsınız");
            }else {
                System.out.println("Kan bağısı yapabilirsiniz");
            }
        }















    }
}

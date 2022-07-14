package E02_practice;

import java.util.Scanner;

public class E0_StringManipulatıon {
    public static void main(String[] args) {
        /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=scan.next();

        char ortanca= kelime.charAt((kelime.length()-1)/2);

                if(kelime.length()%2==1 && kelime.length()>=3){
                    System.out.println("ortanca karakter: " + ortanca);
                }


    }
}

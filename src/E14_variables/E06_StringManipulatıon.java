package E14_variables;

import java.util.Scanner;

public class E06_StringManipulatıon {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            int bosluk = str.indexOf(' ');
            if (bosluk == -1 && !(str.isEmpty())) {
                System.out.println("bosluk yoktur");
            } else {
                System.out.println("bosluk vardir");
            }
    }
}


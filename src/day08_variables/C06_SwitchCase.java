package day08_variables;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /* Kullanıcıdan gün ismi alın haftaiçi veya haftadssonu olduğunu yazdırın

        */

        String input="pazartesi";
        input=input.toLowerCase();
        switch (input) {
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaiçi");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Geçerli bi gün giriniz");

        }


    }
}

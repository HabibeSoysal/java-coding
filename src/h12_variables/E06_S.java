package h12_variables;

import java.util.Locale;
import java.util.Scanner;

public class E06_S {
    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
                */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iş unvanınızı giriniz");
        String jobTıtle=scan.nextLine().toLowerCase();

        System.out.println("jobTıtle = " + jobTıtle);

        if (jobTıtle.equals("qa")){
            System.out.println("Quality Analyst");
        }else if (jobTıtle.equals("dev")){
            System.out.println("Developer");
        } else if (jobTıtle.equals("ba")) {
            System.out.println("Business Analyst");
        } else if (jobTıtle.equals("pa")) {
            System.out.println("Project Manager");
        }else {
            System.out.println("Yanlış giriş yapotınız");
        }


       switch (jobTıtle){
            case "qa":
                 System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("Yanlış formatta bilgi girişi yaptınız");

        }

    }
}

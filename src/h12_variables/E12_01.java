package h12_variables;

import java.util.Scanner;

public class E12_01 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);
        System.out.print("İsminiz:");
        String isim=scan.nextLine();

        System.out.print("Memleketiniz:");
        String memleket=scan.next();

        System.out.println("Konumunuz:");
        String konum=scan.next();

        System.out.println("Yasınız:");
        int yaş=scan.nextInt();

        System.out.println("Boyunuz: ");
        double boy=scan.nextDouble();

        System.out.println("yasadıgınız :" + konum +"mu seviyor musunuz?true/false ");
         boolean seviyorMu=scan.hasNextBoolean();

        System.out.print("isim = " + isim);
        System.out.print("memleket = " + memleket);
        System.out.print("konum = " + konum);
        System.out.println("boy = " + boy);
        System.out.println("yaş = " + yaş);
        System.out.println("seviyorMu = " + seviyorMu);
















    }
}

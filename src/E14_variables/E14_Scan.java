package E14_variables;

import java.util.Scanner;

public class E14_Scan {
    public static void main(String[] args) {

/*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür.
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir işçi bir işi kaç günde bitirmektedir:");
        double bitirmeSüre=scan.nextDouble();
        System.out.println("Toplam kaç işçi çalışsacak?:");
        double isciSayısı=scan.nextDouble();

        double topluBitirmeSüresi=bitirmeSüre/isciSayısı;
        System.out.println("topluBitirmeSüresi = " + topluBitirmeSüresi);


    }
}

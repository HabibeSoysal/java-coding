package day07_practice;

public class C03_IfStatements {
    public static void main(String[] args) {
        int sayi=20;

        if (sayi > 0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktır");

        if (sayi % 2== 0)
            System.out.println("sayi çift");
        System.out.println("çift kalacaktr");

        if (sayi % 5 == 0)
            System.out.println("sayi 5 in tam katı");
    }
}

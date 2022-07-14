package day18_doWhıleLoop;

public class C02_WhıleLoop {
    public static void main(String[] args) {
        /*
        7.) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdiri
         */
        int input=5432;

        int rakamlarToplam=0;
        int birlerBasamagı=0;
        int temp=input;
        while (temp > 0) {

            birlerBasamagı=temp%10;
            rakamlarToplam+=birlerBasamagı;
            temp/=10;

        }

        System.out.println(input + " sayısının rakamlar toplamı :" + rakamlarToplam);

    }
}

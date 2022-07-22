package day13_variables;

public class C02_MethodCreatıon3 {
    public static void main(String[] args) {

        // Verilen 3 basamaklı bir sAYININ RAKAMLARI TOPLAMINI YAZDIRAN BİR METHOD POLUŞTURALIM
       int input=520;
       rakamlarıTopla(input);


    }
    public static void rakamlarıTopla(int input) {
        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int temp=input;

        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;


        System.out.println("Girdiğiniz "+ temp + " sayısının rakamlar toplamı"+ rakamlarToplamı );




    }


}

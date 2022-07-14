package day010_variables;

public class H02_Mani {
    public static void main(String[] args) {

        /*
        String seklinde verlen asagidaki fiyatlarin toplamini bulunuz

        ipucu : methodunu kullanabilirsiniz.


        ipucu :  methodunu kullanabilirsiniz

        String str2 = “$10.55”"
         */
        String str1="$13.99";
        String str2="$10.55";
        System.out.println(str1.replace("$",""));
        double a=13.99;
        double b=10.55;
        System.out.println("toplam : $" +(a+b));

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double str1sayi=Double.valueOf(str1);
        double str2sayi2=Double.valueOf(str2);

        double sonuc=(str1sayi+str2sayi2)/100;
        System.out.println("toplam : $" + sonuc);

    }
}

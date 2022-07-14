package h12_variables;

public class H12_DataCasting {
    public static void main(String[] args) {
       /* double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        yazdirin

        */
        double num1=2.36;
        int num2= (int) num1;
        System.out.println(num2);
        byte num3=(byte)num2;
        System.out.println(num3);
// int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        int a=55;
        int b=12;
        int c=(a/b);
        System.out.println(c);
        // int bir sayiyi double bir sayiya bolun ve sonucu yazdiri
    int sayi=3250;
    double d =256.654;
    double sonuc=(sayi/d);
        System.out.println("sonuc = " + sonuc);

    }
}

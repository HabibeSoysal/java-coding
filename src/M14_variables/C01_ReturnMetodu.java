package M14_variables;

public class C01_ReturnMetodu {
    public static void main(String[] args) {
        /*
        verilen iki sayıyı carpıp sonucu bize döndüren bir metod yapalım
         */
        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);


    }

    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1*sayi2;


    }
}

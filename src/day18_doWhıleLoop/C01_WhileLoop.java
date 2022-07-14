package day18_doWhıleLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;//ilk harfiiz bozmamak için
        String buyult="";
        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp+=1;
    }
}   }

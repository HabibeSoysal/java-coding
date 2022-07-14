package ha18_Loop;

import java.util.Scanner;

public class H05_IntetviewLoop {
    public static void main(String[] args) {
        /*
        ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
sayinin faktoryel’ini bulun. (5!=5*4*3*2*1
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 10 dan küçük bir samsayı giriniz");
        int faktör=scan.nextInt();

       if (faktör>=0 && faktör<10){
           int toplam=1;
           for (int i = 1; i <= faktör; i++) {
               toplam *= i;
           }System.out.println("toplam = " + toplam);
       }else{
           System.out.println("yanlış giriş");
       }


    }

    public static class C03_DoWhıleLoop {
        public static void main(String[] args) {
            /*
            while loop ta nce kontrol edip sonra işlm yaptgımız icin işlem bittikten sonra lop un kırılması için
             bir kez daha başadönmemiz gerekiyor. bu durumda fazadan bir işlem yapılıyo


             */
            int sayı=7;
            while (sayı<10){
                System.out.println(sayı);
                sayı++;

            }
    /*
    do whıle oop ile çalıştıgımızda bu dezavantaj ortadan kalkar
     */
        do {
            System.out.println(sayı);
            sayı++;
        }while (sayı<10);

            }




        }

    public static class day18_WhileDoWhile {
        public static class C01_DoWhıleLoop {
            public static void main(String[] args) {
                /*
                Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        yapmadigini farz edin
                 */
                char ilkHarf='f';
                char sonHarf='t';
                char temp=ilkHarf;
                String buyult="";

                while (temp<=sonHarf){
                    buyult=(temp + " ").toUpperCase();//char a string ekle hiçlik string demek
                    System.out.print(buyult + " ");
                    temp+=1;



                }








            }
        }
    }
}

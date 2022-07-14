package ha18_Loop;

public class H4_WhileForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
yapmadigini farz edin  day 18 de yapıldıchar ilkHarf='f';

         */
        char ilkHarf='d',temp=ilkHarf;
        char sonHarf='h';
        String buyult="";
        while (temp<=sonHarf){
          buyult=(temp + "").toUpperCase();
            System.out.print(buyult+ " ");
          temp+=1;
        }

    }

}

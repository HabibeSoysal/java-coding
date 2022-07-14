package ha18_Loop;

public class H2_WhileForLoop {
    public static void main(String[] args) {
         /*
         ) For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
bolunebilen sayilari yazdirin.
          */
        int bas = 100, bitis = 999;
        int bölünebilenSayılar = 0;

        for (int i = bas; i <= bitis; i++) {
            while (i % 15 == 0 && i% 20 == 0 && i% 90 == 0) {
                System.out.print(i+" ");
                i++;

            }
        }
    }
}
package ha18_Loop;

public class H3_WhileForLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
         */

        int bas=13,bit=55;

        while (bas<=bit){
            if (bas%2==0){
                System.out.print(bas +" ");
            }
            bas++;
    }



    }
}

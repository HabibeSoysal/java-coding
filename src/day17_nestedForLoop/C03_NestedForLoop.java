package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        VErilen yuksaklık ve boy yerine göre * lardan oluşan bir dikdortgen oluşturalım
        yuksaklık=3
        boy 4 olduğunda
        * * * *
        * * * *
        * * * *
         */
        int yük=4;
        int boy=8;
        for (int i =1; i <=yük ; i++) {
            for (int j =1; j <=boy; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}

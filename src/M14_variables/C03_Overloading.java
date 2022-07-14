package M14_variables;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5, 7);
        topla(5.2, 3);
        topla(3.4, 6.1);
        topla(5, 6.2);

    }

    public static void topla(int a, int b) {

        System.out.println("iki integerın toplamı = " + (a + b));
    }

    public static void topla(double a, int b) {
        System.out.println("bir double ve bir integer ın toplamı = " + (a + b));

    }

    public static void topla(double a, double b) {
        System.out.println("iki double ın toplamı = " + (a + b));

    }
    public static void topla(int  a, double b) {

        System.out.println("bir integer bir  double ın toplamı = " + (a + b));
}


}
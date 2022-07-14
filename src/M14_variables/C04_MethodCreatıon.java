package M14_variables;

public class C04_MethodCreatıon {
    public static void main(String[] args) {
        //input olarak verilen 2 int toplayıp sonucunu oluşturan bir method oluşturun
        int input1=30;
        int input2=20;

        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {
        System.out.println("Girilen iki sayının toplamı:"+(input1+input2));
    }

}

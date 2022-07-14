package day17_nestedForLoop;

public class C07_WhıleLoop {
    public static void main(String[] args) {
        /*
        20 de 50(dahil)ye kadar cift sayıları yazdıralım
         */
        int baş=20;
        int bit=50;
        for (int i = 20; i <=50; i++) {
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("");
        int temp=baş;
        while(temp<=bit){
            if (temp%2==0){
                System.out.print(temp +" ");
            }
            temp++;
        }

    }
}

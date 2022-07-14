package M14_variables;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        1 den 5 e kadar (dahil)olan tamsayıları toplayalım.
         */

        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);

        toplam+=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("10-20 arası toplam = " + toplam);

        toplam=0;
        for (int i = 30; i <= 50; i+=2) {
            toplam+=i;
            }
        System.out.println("30-50 arası cift sayıların toplam = " + toplam);
        toplam =0;
        for (int i = 30; i <50; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arası cift sayıların toplam = " + toplam);


        toplam=0;
        for (int i =1500; i <1600; i++) {
            if(i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500-1600 arası yedi ile bölünebilen sayıların toplam = " + toplam);
        }



}


package day14_variables;

public class C08_Faktöriyel {
    public static void main(String[] args) {
        /*
        inpu olark verilen bir tamsayı için faktöriyel hesaplayıp yazdıran  bir metot yazdırın
        veriilen sayı negatif veya 20 den büyük olursa  girilen sayının  faktöreiyeli hesaplanamaz yazısı yazdırın.
         */
        int input=6;
        faktriyelHesapla(input);
    }

    public static void faktriyelHesapla(int input) {
        int faktöriyel=1;
        if (input<0 || input>20){
            System.out.println("Verilen sayi icin faktöriyel hesaplanamaz");
        } else if (input==0) {
            System.out.println("0!=1 dir");

        }else{
            for (int i = 1; i <=input; i++) {
                faktöriyel*=i;

            }
            System.out.println("Faktöriyel degeri :" +faktöriyel);
        }


    }
}

package E14_variables;

public class E14_TerNested {
    public static void main(String[] args) {
        /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
   int sayi=5;
   String sonuc="";
   if (sayi>=0 && sayi<=9){
       if (sayi==9){
           System.out.println("dokuz");
       }else if (sayi==8){
           System.out.println("sekiz");
       }else if (sayi==7){
           System.out.println("yedi");
       }else if (sayi==6){
           System.out.println("Altı");
       } else if (sayi==5) {
           System.out.println("Bes");
       }else if (sayi==4){
           System.out.println("Dört");
       }else if (sayi==3){
           System.out.println("üc");
       }else if (sayi==2){
           System.out.println("İki");
       }else if (sayi==1) {
           System.out.println("bir");
       }else sonuc="sifir";
   }else sonuc="Geçersiz";
       System.out.println("sonuc = " + sonuc);



       int n=4;
       String result=n==9?"dokuz":n==8?"Sekiz":n==7?"yedi":
               n==6?"Altı":n==5?"Bes":n==4?"Dört":n==3?"Üc":n==2?"iki":n==1?"bir":n==0?"sifir":"geçersiz";
       System.out.println("result = " + result);

   }


}


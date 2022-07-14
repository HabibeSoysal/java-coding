package ha18_Loop;

public class H03_TnterviewLoop {
    public static void main(String[] args) {
        /*
        Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
palindrome olup olmadigini kontrol eden bir program yazin.
         */
        String x = "123455421";
        palindromeSor(x);

    }
    public static void palindromeSor(String x) {
        String tersX = x.substring(x.length() - 1);
        for (int i = x.length()- 2; i >= 0; i--) {
            tersX += x.substring(i, i + 1);

        }if(tersX.equals(x)){
            System.out.println(tersX + " bu sayı bir palindromedur");
        }else {
            System.out.println(tersX + " bu sayı bir palindrome degildir");
        }
    }
}
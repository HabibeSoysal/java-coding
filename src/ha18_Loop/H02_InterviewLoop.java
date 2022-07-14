package ha18_Loop;

public class H02_InterviewLoop {
    public static void main(String[] args) {
        //) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.


        String str="Ey Java kolaylıkla gel";
        String terStr=str.substring(str.length()-1);
        for (int i =str.length()-2; i>=0; i--) {
            terStr+=str.substring(i,i+1);
        }
        System.out.println(terStr);

        //Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren
//bir method yazin.
        String a="Şanına Yakışır Şükürler Olsun";
        tersGel(a);

    }
    public static void tersGel(String a) {
        String tersA=a.substring(a.length()-1);
        for (int i =a.length()-2; i >=0; i--) {
            tersA+=a.substring(i,i+1);
            }
            System.out.println(tersA);
        }

    }

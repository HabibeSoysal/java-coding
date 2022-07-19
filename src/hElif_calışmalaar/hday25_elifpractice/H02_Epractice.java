package hday25_elifpractice;

public class H02_Epractice {
    public static void main(String[] args) {


    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */


        String[][] str1={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;
        for (int i = 0; i <str1.length ; i++) {
            for (int j = 0; j <str1[i].length ; j++) {
                if (str1[i][j].contains("$")){
                    toplam+=Double.parseDouble(str1[i][j].replace("$",""))*3.2;
                }else {
                    toplam+=Double.parseDouble(str1[i][j].replace("€",""))*4.2;
                }

            }

        }
        System.out.println("toplam = " + toplam);








}
 }
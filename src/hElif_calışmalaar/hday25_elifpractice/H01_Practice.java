package hday25_elifpractice;

public class H25_Practice {
    public static void main(String[] args) {
        /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D - Dimensional arrayinden min number print et
     */
        int[][] arr={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int minSayı=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]<minSayı){
                    minSayı=arr[i][j];
                }
            }
        } System.out.println("minSayı = " + minSayı);











    }

}

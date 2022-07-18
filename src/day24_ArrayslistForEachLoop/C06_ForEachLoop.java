package day24_ArrayslistForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ {
    public static void main(String[] args) {

        int[] arr ={2,3,5,6,3,25};
        List<Integer> liste = new ArrayList<>();

        for (int  each: arr) {
            if (each%2==1){
                liste.add(each);
            }
        } System.out.println(liste);
    }
}

// Q1 : Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
package JAVA;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> arrlist = Arrays.asList(arr);
        Collections.shuffle(arrlist);
        arrlist.toArray(arr);
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+",");
        }
        
    }
}

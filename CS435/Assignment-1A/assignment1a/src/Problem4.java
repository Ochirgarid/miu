import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Problem4 {
    public static void sort(ArrayList<Integer> list){
        // bubble sort
        for(int i = list.size() - 1; i >= 0; i --) {
            for(int j = 1; j <= i; j++) {
                if(list.get(j) < list.get(j - 1)) {
                    Collections.swap(list, j, j - 1);
                }
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }
    
    public static void sort(LinkedList<Integer> list){
        // insertion sort
        for(int i = list.size() - 1; i >= 0; i--) {
            int curMax = list.get(i).intValue();
            for (int j = 0; j < i; j ++) {
                int curVal = list.get(j).intValue();
                if(curVal > curMax) {
                    list.set(j, curMax);
                    curMax = curVal;
                }
            }
            list.set(i, curMax);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }
}

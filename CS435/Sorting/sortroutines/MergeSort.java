package sortroutines;

import java.util.Arrays;
import runtime.Sorter;

public class MergeSort extends Sorter{
    public int[] sort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        
        // Partition
        int p1Length = arr.length / 2;
        int p2Length = arr.length - p1Length;

        int[] p1 = new int[p1Length];
        int[] p2 = new int[p2Length];

        for(int i = 0; i < p1Length; i++) {
            p1[i] = arr[i];
        }
        for(int i = 0; i < p2Length; i++) {
            p2[i] = arr[p1Length + i];
        }
        // Recursion
        p1 = sort(p1);
        p2 = sort(p2);

        // Merge
        int p1i = 0;
        int p2i = 0;

        for(int i = 0; i < arr.length; i++) {
            if(p1i == p1Length || (p2i < p2Length && p1[p1i] > p2[p2i]) ) {
                arr[i] = p2[p2i];
                p2i ++;
            } else {
                arr[i] = p1[p1i];
                p1i ++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		MergeSort ms = new MergeSort();
		
		System.out.println(Arrays.toString(ms.sort(test)));
		
	}
}

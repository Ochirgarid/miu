package sortroutines;

import java.util.Arrays;

import runtime.Sorter;

public class BubbleSort1 extends Sorter{
    public int[] problem6(int[] arr){
        int countZero, countOne;
        countZero = 0;
        countOne = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {countZero ++;}
            if(arr[i] == 1) {countOne ++;}
        }

        for(int i = 0; i < arr.length; i++) {
            if(i < countZero) {
                arr[i] = 0;
            } else {
                if (i < countZero + countOne) {
                    arr[i] = 1;
                } else {
                    arr[i] = 2;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; ++i) {
            boolean swapped = false;
            for(int j = 0; j < len - 1; ++j) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort1 bs = new BubbleSort1();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}
}

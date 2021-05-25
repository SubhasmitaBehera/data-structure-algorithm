package sort;

import java.util.Arrays;

//Bubble sort compares the consecutive element.

public class OptimizedBubbleSort {
    //in optimized bubble sort,when the array become sort after some steps then the first for loop should break. hence decreases the time complexity.

    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        for (int i =0;i< arr.length;i++){
           boolean flag = false;
           for (int j = 0;j< arr.length-1-i;j++){ //Here the second for loop run 1 time less to avoid the arrayIndexOutOfBound error near arr[j+1].
               if (arr[j]>arr[j+1]){
                   int temp= arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1]= temp;
                   flag = true;
               }
           }
           if (flag == false)
               break;
        }
        System.out.println(Arrays.toString(arr));
    }

}

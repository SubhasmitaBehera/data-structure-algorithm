import java.util.ArrayList;
import java.util.Arrays;

//In selection sort algo sorts an array by repeatedly finding the minimum element from unsorted part
// and putting it at the beginning.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11,33,6,-20,100};
        int k;
        for (int i = 0;i< arr.length-1;i++){
            int min_idx = i;
            for (int j = i+1; j< arr.length;j++) {

                if (arr[min_idx] > arr[j])
                    min_idx = j;
            }
                    k=arr[i];
                    arr[i]=arr[min_idx];
                    arr[min_idx]=k;

            }

        System.out.println(Arrays.toString(arr));

    }
}

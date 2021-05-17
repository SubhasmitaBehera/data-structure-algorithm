import java.util.Arrays;

public class BubbleSortRecursively {
    public static void main(String[] args) {
        int[] arr = {12, 67, 21, 43, 98, 65};

        sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int len) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            if (len==1){
                return;      //return get outside from the function.
            }
        }
        sort(arr,len-1);

    }
}

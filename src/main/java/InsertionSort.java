import java.util.Arrays;

//1: Iterate from arr[1] to arr[n] over the array.
// 2: Compare the current element (key) to its predecessor.
// 3: If the key element is smaller than its predecessor, compare it to the elements before.
// Move the greater elements one position up to make space for the swapped element.

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        for (int i =1; i< arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

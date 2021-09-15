package t1_array;

//Write a C function to return minimum and maximum in an array.
//        Your program should make the minimum number of comparisons.

public class MaxMinOfArray {
    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new  Pair();
        int i;
        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        /* If there are more than one elements, then initialize min
    and max*/
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i = 2; i < n; i++) {        //here no. of comparison reduces 2(for index 0 & 1)   and loop runs 2 times lesser.
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000,2};
//        int arr_size = 6;
//        Pair minmax = getMinMax(arr, arr_size);
//        System.out.printf("\nMinimum element is %d", minmax.min);
//        System.out.printf("\nMaximum element is %d", minmax.max);

//        int[] arr = {2,1,22,54,3,90,0,-231231231,2123123123};
        int c = 0;
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);

        int i = 0,j = arr.length-1;
        while (i < j){
            if(arr[i] < min) {
                min = arr[i];
                c++;
            }
            if(arr[j] < min) {
                min = arr[j];
                c++;
            }
            if(arr[i] > max) {
                max = arr[i];
                c++;
            }
            if(arr[j] > max) {
                max = arr[j];
                c++;
            }
            i++;
            j--;
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
        System.out.println("comp : "+c);
    }
}

package array;

//Given an array (or string), the task is to reverse the array/string.
//        Examples :
//
//
//        Input  : arr[] = {1, 2, 3}
//        Output : arr[] = {3, 2, 1}

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
       int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element you want to reverse: ");
       for(int i=0;i< arr.length;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("Array is:- ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse of the above array is:- ");
        for(int i=arr.length-1;i>=0 ;i--){
            System.out.print(arr[i]+" ");
        }
    }


    //*** In GFG ***

//    static void rvereseArray(int arr[],
//                             int start, int end)
//    {
//        int temp;
//
//        while (start < end)
//        {
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    /* Utility that prints out an
//    array on a line */
//    static void printArray(int arr[],
//                           int size)
//    {
//        for (int i = 0; i < size; i++)
//            System.out.print(arr[i] + " ");
//
//        System.out.println();
//    }
//
//    // Driver code
//    public static void main(String args[]) {
//
//        int arr[] = {1, 2, 3, 4, 5, 6};
//        printArray(arr, 6);
//        rvereseArray(arr, 0, 5);
//        System.out.print("Reversed array is \n");
//        printArray(arr, 6);
//
//    }

}

package t1_array;

//Given an array (or string), the task is to reverse the array/string.
//        Examples :
//
//
//        Input  : arr[] = {1, 2, 3}
//        Output : arr[] = {3, 2, 1}

public class ReverseAnArray {
    //*** In GFG ***

    static void revereseArray(int arr[],
                             int start, int end)
    {
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    //**OR
    
//static void revereseArray(int arr[],
//                          int start, int end)
//    {
//        int temp;
//        if (start >= end)
//            return;
//        temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        revereseArray(arr, start+1, end-1);
//    }

    /* Utility that prints out an
    array on a line */
    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, arr.length);
        revereseArray(arr, 0, arr.length-1);
        System.out.println("Reversed array is ");
        printArray(arr, arr.length);

    }

}

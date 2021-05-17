import java.util.Scanner;

//In binary search the array must be SORTED array.
//Here we take 3 element; left element, right element and mid element. mid= (left+right )/2
//If the search element is not the left or right element and if the search element is greater the mid then we update the
//left part to mid and mid to right , similar if the search elemnt is less than the mid.
//The loop will continue while the search element is not found and (left-right)>1.

public class BinarySearch {
    static int count = 0;
    public static void main(String[] args) {
//       static int count =0;
        int[] arr = {12,23,34,45,56,67,78,89,90};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        if (binarySearch(arr,search)==-1)
            System.out.println("Element not found.");
        else
            System.out.println(search + " is found at index "+binarySearch(arr,search)+"  "  +count );
    }

    private static int binarySearch(int[] arr, int search) {
        int left =0,right = arr.length-1;
//        count =0;
        if (search==arr[left]) {
            count++;
            return 0;
        }
        else if (search == arr[arr.length-1]){
            count++;
            return arr.length-1;
        }
        while (right-left>1) {
            int mid = (left + right) / 2;
            if (search>arr[mid]) {
                count++;
                left = mid;
            }
            else if(search<arr[mid]) {
                count++;
                right = mid;
            }
            else {
                count++;
                return mid;
            }
        }
        return -1;
    }
}

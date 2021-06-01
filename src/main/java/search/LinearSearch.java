package search;

import java.util.Scanner;

//In linear search we search for a particular element from the given array.
//To do so we run a loop from start to end of the array.
//Here we have two conditions inside the loop, one is from starting and another is from the end for a single iteration.
//After running the loop if the search element is not found, for that case we have declared a boolean flag
//so that we can find out in case the element is not present in the array.

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,80,30,60,50,110,100,130,170,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search:- ");
        int search = sc.nextInt();
        boolean flag = false;
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            count++;
            if(search==arr[i] ){
                flag = true;
                System.out.println(i);
                System.out.println("Element "+search+ " is present at index "+i);
                break;
            }
            else if(search==arr[arr.length-1-i] ){
                flag = true;
                System.out.println(arr.length-1-i);
                System.out.println("AElement "+search+ " is present at index "+(arr.length-1-i));
                break;
            }
        }
        System.out.println(count);
        if(flag==false){
            System.out.println("-1");
            System.out.println("Element "+search+ " is not present in arr[].");

        }
    }
}

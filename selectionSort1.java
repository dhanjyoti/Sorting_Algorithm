import java.io.*;
import java.util.*;

public class SelectionSort1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        SelectionSort.sort(arr);

        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

class SelectionSort{
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            // Find the minimum element in the unsorted part of the array.
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part of the array.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

}
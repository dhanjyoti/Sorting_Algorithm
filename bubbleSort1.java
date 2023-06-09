import java.io.*;
import java.util.*;

public class BubbleSort1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class QuickSort1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sixe of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j=start; j<end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}
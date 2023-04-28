import java.io.*;
import java.util.*;

public class MergeSort1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, size - 1);

        System.out.println("Sorted array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void mergeSort(int[] arr, int start, int end){
        if(start<end){
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0; i<n1; i++){
            leftArr[i] = arr[start + i];
        } 

        for(int i=0; i<n2; i++){
            rightArr[i] = arr[mid + 1 + i];
        }

        int i=0, j=0, k=start;

        while(i<n1 && j<n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while(i<n1){
            arr[k++] = leftArr[i++];
        }

        while(j<n2){
            arr[k++] = rightArr[j++];
        }
    }
}
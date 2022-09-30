package Sorting;
import java.util.*;

public class quickSorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    //https://www.youtube.com/watch?v=Hoixgm4-P4M&t=7s       //video is of only 3 min, please watch it first
    //QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and 
    //partitions the given array around the picked pivot. In the partition we put put all smaller elements 
    //(smaller than x) before x, and put all greater elements (greater than x) after x.
    public static void quickSort(int arr[], int start, int end) {
        if(start<end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j <= end-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//Time complexity : In average case it will be O(n * log(n)) and in worst case it would be (n * n).
// Although the worst case time complexity of QuickSort is O(n2) which is more than many other sorting algorithms like Merge Sort and Heap Sort, QuickSort is faster in practice, because its inner loop can be efficiently implemented on most architectures, and in most real-world data. QuickSort can be implemented in different ways by changing the choice of pivot, so that the worst case rarely occurs for a given type of data. However, merge sort is generally considered better when data is huge and stored in external storage. 
// Practice : https://practice.geeksforgeeks.org/problems/quick-sort/1
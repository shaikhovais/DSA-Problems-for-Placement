package Sorting;
import java.util.*;

public class mergeSorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    //https://www.youtube.com/watch?v=4VqmGXwpLqc           //video is of only 3 min, please watch it first
    //Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves and then it 
    //merges the two sorted halves. Array is recursively divided into two halves till the size becomes 1. 
    //Once the size becomes 1, then with the help of merge function we start merging arrays back till the 
    //complete array is merged.

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid , end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end) {
        int aSize = mid-start+1;
        int bSize = end-mid;
        int[] a = new int[aSize];
        int[] b = new int[bSize];
        int k = 0;
        for(int i = start; i <= mid; i++) {
            a[k] = arr[i];
            k++;
        }
        k = 0;
        for(int i = mid+1; i <= end; i++) {
            b[k] = arr[i];
            k++;
        }
        int i = 0; int j = 0; k = start;
        while(i<aSize && j<bSize) {
            if(a[i] < b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<aSize) {
            arr[k] = a[i];
            k++;
            i++;
        }
        while(j<bSize) {
            arr[k] = b[j];
            k++;
            j++;
        }
    }
}

//Time complexity : The time complexity of Merge Sort isθ(N * log(N)) in all 3 cases (worst, average, and best) as merge sort always divides the array into two halves and takes linear time to merge two halves.
//Space complexity : O(n) because of extra arrays in merge functions
// Practice : https://practice.geeksforgeeks.org/problems/merge-sort/1
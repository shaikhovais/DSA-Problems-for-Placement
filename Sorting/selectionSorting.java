package Sorting;
import java.util.*;

public class selectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    // https://www.youtube.com/watch?v=g-PGLbMth_g          //video is of only 2 min, please watch it first
    // https://takeuforward.org/sorting/selection-sort-algorithm/
    //The algorithm maintains two subArrays in a given array. The subArray which is already sorted. 
    // (In selection sort, left part gets sorted first while in bubble sort, right side is first)
    //Remaining subArray which is unsorted. In every iteration of selection sort, the minimum element 
    //(considering ascending order) from the unsorted subArray is picked and moved to the sorted subArray. 
    public static void selectionSort(int arr[], int n) {
        for(int i = 0; i < n-1; i++) { //n-1 becuase last element will be automatically sorted
            int minimum = i;           //selecting index to swap the minimum element
            for(int j = i+1; j < n; j++) { //j will be i+1 because earlier elements will be sorted
                if(arr[j] < arr[minimum]) {  //if arr[j] is smaller than minimum, then we change minimum to j
                    minimum = j;           
                }
            }
            if(minimum != i) {              //if i is the minimum then no need to swap
                swap(arr, minimum, i);      //calling swap function
            }
        }
    }
    public static void swap(int arr[], int minimum, int i) {
        int temp = arr[minimum];
        arr[minimum] = arr[i];
        arr[i] = temp;
    }
}

//Time complexity : O(n^2) because we will be having two nested for loops
//Space complexity : O(1) because no extra space is used
// Practice: https://practice.geeksforgeeks.org/problems/selection-sort/1
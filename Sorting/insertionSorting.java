package Sorting;
import java.util.*;

public class insertionSorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr,n);
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //https://www.youtube.com/watch?v=JU767SDMDvA           //video is of only 2 min, please watch it first
    //https://takeuforward.org/data-structure/insertion-sort-algorithm/
    // The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are 
    //picked and placed at the correct position in the sorted part.
    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int current = arr[i];       //we choose an element 
            int j = i - 1;
            //we iterate in sorted part and check if it's smaller than any element
            while (j >= 0 && arr[j] > current) { 
                arr[j+1] = arr[j];  //shifting greater element to right side
                j--;
            }
            arr[j+1] = current; //placing current element in it's correct position
        }
        
    }
}

//Time complexity : O(n^2) because we will be having two nested for loops
//Space complexity : O(1) because no extra space is used
// Practice : https://practice.geeksforgeeks.org/problems/insertion-sort/0
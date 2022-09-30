package Sorting;
import java.util.*;

public class bubbleSorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    //https://www.youtube.com/watch?v=xli_FI7CuzA       //video is of only 2 min, please watch it first
    // https://takeuforward.org/sorting/bubble-sort-algorithm/
    //Bubble Sort is the simplest sorting algorithm that works by repeatedly 
    //swapping the adjacent elements if they are in the wrong order. 
    //There are two nested for loops and in each loop we are iterating from starting('0')
    // to second last('n-1'). In each iteration, sorted array from right side will increase
    public static void bubbleSort(int arr[], int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {   //if the right element is greater than left, then we swap 
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//Time complexity : O(n^2) because we will be having two nested for loops   
//Space complexity : O(1) because no extra space is used
// Practice : https://practice.geeksforgeeks.org/problems/bubble-sort/1

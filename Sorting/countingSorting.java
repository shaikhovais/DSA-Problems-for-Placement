package Sorting;
import java.util.*;

public class countingSorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countingSort(arr, n);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    //https://www.youtube.com/watch?v=imqr13aIBAY
    public static void countingSort(int []arr, int n) {
        //arr = {3, 5, -1, -3, 8, 2, 2}  n = 7

        //get element with maximum value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        //max = 8 min = -3 
        
        int range = max - min + 1;
        int count[] = new int[range]; //array to store count of element of size range
        int output[] = new int[n]; //array to store ans
        
        //store count of elements(like a frequency array)
        for(int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }
        // 1 0 1 0 0 2 1 0 1 0 0 1 -> count array

        //cumulative count of array
        for(int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // 1 1 2 2 2 4 5 5 6 6 6 7 -> count array

        //now sort the array based on count and also decrement the count
        for(int i = 0; i < n; i++) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        // -3 -1 2 2 3 5 8 -> Output array(sorted)

        //copy output array to original array
        for(int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
        // -3 -1 2 2 3 5 8 -> Original array(sorted)

        //Time complexity : O(n + k) n = input size and k = range (max number)
        //Space complexity : O(k)
    }

}

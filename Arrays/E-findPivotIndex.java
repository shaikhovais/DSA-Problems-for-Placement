
//https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        //This array will store the running sum of our array
        //e.g arr[1,2,4] runningSumArr[1,3,7]
        //runningSum[n - 1] wil store sum of all the numbers 
        int runningSumArr [] = new int[n];
        runningSumArr[0] = nums[0];
        for(int i = 1; i < n; i++) {
            runningSumArr[i] = runningSumArr[i - 1] + nums[i];
        }
        
        
        //To check if sum of all the numbers in array excluding first number is '0' (see e.g '3' to understand)
        if(runningSumArr[n - 1] - nums[0] == 0) {
            return 0;
        }
        
        //We iterate over runningSumArr and see if there is any index with previous runningSum[i - 1](sum of all elements on left side of index) == total sum - sum till that index(this is basically sum of all elemenets on right side of index)
        for(int i = 1; i < n; i++) {
            if(runningSumArr[i - 1] == (runningSumArr[n - 1] - runningSumArr[i])) {
                return i;
            }
        }
        
        return -1;
    }
}

//Time complexity : O(n) because we are iterating over the array 2 times, O(2n) which we can say as O(n)
//Space complexity : O(n) because we are using extra array of 'n' size to store running sum
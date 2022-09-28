
//https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] arr) {
        //Create two variables : one will store sum of the current subArray and other will store maximum in the whole array

        //Taking MIN_VALUE so that it gets updated even when negative numbers are present in array
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        
        int length = arr.length;

        for(int i = 0; i < length; i++) {
            maxEndingHere += arr[i];
            
            //If sum of current subArray is greater then we update maxSoFar
            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }

            //If sum is negative then we change it to 0 and start again
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
}

//Time complexity : O(n) because we will be iterating over complete array for one time
//Space complexity : O(1) because no extra space is used
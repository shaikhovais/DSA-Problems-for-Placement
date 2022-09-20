
//https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

//Time complexity : O(n) because we are iterating over the complete array
//Space complexity : O(1) because we are not creating any extra array
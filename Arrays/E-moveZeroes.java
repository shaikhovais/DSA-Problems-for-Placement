
//https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        
        //Logic here is to have a pointer that will store all non-zero values in relative order 
        //and then in our second loop we will change the rest of the values to 0
        
        int pointer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        
        while(pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }
    }
}

//Time complexity : O(n)
//Space complexity : O(1) 
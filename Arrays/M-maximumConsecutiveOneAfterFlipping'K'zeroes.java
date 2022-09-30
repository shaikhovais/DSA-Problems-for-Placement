
//https://leetcode.com/problems/max-consecutive-ones-iii/
// https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1

class Solution {
    public int longestOnes(int[] nums, int k) {
        //we use sliding window to create a window of maximum size of 1's after flipping(including) 'k' 0's
        int result = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length) {
            //we encounter 0, we decrement 'k'
            if(nums[right] == 0) {
                k--;
            }
            //if our window has more '0' than we run a while loop to remove extra 0 from left side
            while(k < 0) {
                if(nums[left] == 0) {
                    k++;
                }
                left++;
            }
            //at this point our window will have '0' either k or less than k
            //we get the size of window by(right - left + 1) and compare to see if it's maximum
            result = Math.max(right - left + 1, result);
            right++;
        }
        return result;
    }
}

//Time complexity : O(n) we will be iterating over the complete array. Inner 'while' loop will atmost run for 'n', so even in worst case it will be 2*O(n) which is O(n)
//Space complexity : O(1) No extra space is used
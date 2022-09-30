
//https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        
        // Read Boyer-Moore Voting Algorithm in solution
        int count = 0;
        Integer candidate = null;
        for(int num: nums) {
            if(count == 0) {
                candidate = num;
            }
            if(num == candidate) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return candidate;
    }
}

//Time complexity : O(n) we will be iterating over the complete array. 
//Space complexity : O(1)
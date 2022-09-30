
//https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        // We take 3 pointer for three numbers(0,1,2);
        // We move pointerOne and when we encounter 0 we swap it with pointerZero. 
        // Similarly when we encounter 2 we swap with pointerTwo. 
        
        // <----------------Approach One---------------->
        int pointerZero = 0;
        int pointerOne = 0;
        int pointerTwo = nums.length - 1;
        
        while(pointerOne <= pointerTwo) {
            if(nums[pointerOne] == 0) {
                swap(nums, pointerOne, pointerZero);
                pointerOne++; pointerZero++;
            } else if(nums[pointerOne] == 2) {
                swap(nums, pointerOne, pointerTwo);
                pointerTwo--;
            } else {
                pointerOne++;
            }
        }
    }
    
    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
        
        
        // <----------------Approach Two---------------->
    //Simple approach where we count how many times each number has occurred and then put it back in the array
//         int count0 = 0;
//         int count1 = 0;
//         int count2 = 0;
        
//         for(int i = 0; i < nums.length; i++) {
//             if(nums[i] == 0) {
//                 count0++;
//             } else if(nums[i] == 1) {
//                 count1++;
//             } else {
//                 count2++;
//             }
//         }
        
//         int i = 0;
//         while(count0 > 0) {
//             nums[i++] = 0;
//             count0--;
//         }
//         while(count1 > 0) {
//             nums[i++] = 1;
//             count1--;
//         }
//         while(count2 > 0) {
//             nums[i++] = 2;
//             count2--;
//         }
    
}

//Time complexity : O(n) we will be iterating over the complete array. 
//Space complexity : O(1) no extra space is used

//https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //We compare both the array from backward and store the greater in our nums1 array
        
        int pointerOne = m - 1;     //pointer of nums in first array
        int pointerTwo = n - 1;     //pointer of nums in second array
        int pointerInArray = m + n - 1;     //pointer of storing numbers in nums1 array
        
        while(pointerTwo >= 0)  {
            //We compare and put the greater number in our array nums1 and then decrement both the pointers
            if(pointerOne >= 0 && nums1[pointerOne] >= nums2[pointerTwo]) {
                nums1[pointerInArray] = nums1[pointerOne];
                pointerInArray--;
                pointerOne--;
            } else {
                nums1[pointerInArray] = nums2[pointerTwo];
                pointerInArray--;
                pointerTwo--;
            }
        }
    }
}

//Time complexity : O(m + n)
//Space complexity : O(1) 
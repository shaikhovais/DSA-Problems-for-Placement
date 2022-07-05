
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

//Whenever we see a sorted array first thing that comes on our mind is binary search. We will apply here binary search to create a BST
class Solution {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int n = nums.length;
        if(n == 0) {
            return null;
        }
        
        return constructBSTfromSortedArray(nums, 0, n - 1); //helper function
    }
    
    public TreeNode constructBSTfromSortedArray(int nums[], int left, int right) {
        //if left boundary is greater than the right boundary then we return null
        if(left > right) { 
            return null;
        }
        
        //we get the midpoint and create a node of it
        int midPoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midPoint]);
        
        //do a recursive call(how we do in binary search) for leftpart with right boundary as midPoint - 1()
        node.left = constructBSTfromSortedArray(nums, left, midPoint - 1);
        //do a recursive call(how we do in binary search) for rightpart with left boundary as midPoint + 1
        node.right = constructBSTfromSortedArray(nums, midPoint + 1, right);
        
        return node;
        
    }
}

//Time complexity: O(n) since we are iterating completely over an array of size 'n'
//Space complexity: O(h) for recursion call stack, where h is the height of the tree.

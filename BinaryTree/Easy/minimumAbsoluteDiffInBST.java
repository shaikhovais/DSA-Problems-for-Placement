
//https://leetcode.com/problems/minimum-absolute-difference-in-bst/

class Solution {
    
    int min = Integer.MAX_VALUE; //global variable to store ans
    Integer preValue = null; //previous value, which we will use to compare
    
    //When we do inorder traversal on a bst we get all values sorted in increasing order. This is the logic that will be applied here
    public int getMinimumDifference(TreeNode root) {
        if(root == null) { //base condition
            return min;
        }
        
        //since we are doing inorder traversal, first we are going to extreme left
        getMinimumDifference(root.left); 
        
        //if the preValue is not null then we subtract from the value of current node and compare with global 'min'
        if(preValue != null) { 
            min = Math.min(min, root.val - preValue);
        }
        
        //we update the preValue for next node
        preValue = root.val;
        
        //after moving to left we move to right side
        getMinimumDifference(root.right);
        
        return min;
    }
    
}

//Time Complexity: O(n), where n is the total number of nodes in the binary tree
//Space Complexity: O(1), No extra space is used so space complexity is constant

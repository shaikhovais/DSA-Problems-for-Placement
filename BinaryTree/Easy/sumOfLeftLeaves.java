
//https://leetcode.com/problems/sum-of-left-leaves/

class Solution {
    
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeavesHelper(root, false); //helper function
    }
    
    public int sumOfLeftLeavesHelper(TreeNode root, boolean isLeft) {
        if(root == null) {
            return 0;
        }
        
        //we check if it's a leaf node and also if it's on left side, which we will come to know with the help of 'isLeft'
        if(root.left == null && root.right == null && isLeft == true) {
            return root.val;
        }
        
        //we pass true in place of 'isLeft' when we are going on left side
        int leftSubTree = sumOfLeftLeavesHelper(root.left, true);
        //we pass falsein place of 'isLeft' when we are going on right side
        int rightSubTree = sumOfLeftLeavesHelper(root.right, false);
        return leftSubTree + rightSubTree;
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(n) n is the total number of nodes in the binary tree

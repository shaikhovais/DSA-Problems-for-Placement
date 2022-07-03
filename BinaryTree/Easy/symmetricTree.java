
//https://leetcode.com/problems/symmetric-tree/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        //helper function in which we call for both left and right side together
        return isSymmetricHelper(root.left, root.right);
    }
    
    public boolean isSymmetricHelper(TreeNode leftSubTree, TreeNode rightSubTree) {
        //we reached leaf node together so return true
        if(leftSubTree == null && rightSubTree == null) {
            return true;
        }
        
        //one side reached leaf node before so return false
        if(leftSubTree == null || rightSubTree == null) {
            return false;
        }
        
        //if value of both side is same then call for alternate sides(left,right) && (right,left)
        if(leftSubTree.val == rightSubTree.val) {
            return isSymmetricHelper(leftSubTree.left, rightSubTree.right) && isSymmetricHelper(leftSubTree.right, rightSubTree.left);
        }
        
        //if value doesn't match return false;
        return false;
        
    }
}


//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(h) h is the height of the binary tree
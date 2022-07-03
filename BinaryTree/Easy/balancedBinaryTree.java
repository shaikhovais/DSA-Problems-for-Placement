
//https://leetcode.com/problems/balanced-binary-tree/

class Solution {
    
    boolean result = true;
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        isBalancedHelper(root); //helper function
        return result;
    }
    
    public int isBalancedHelper(TreeNode root) {
        if(root == null) { //base condition
            return 0;
        }
        
        //we get the height of left and right side of the current node
        int leftHeight = isBalancedHelper(root.left);
        int rightHeight = isBalancedHelper(root.right);
        
        //if there is any node which is not following the rule of balanced binary tree (left and right subtrees of every node should not differ in height by more than 1), then we make the global variable 'resut' false. We use Math.abs() because any side can be greater than the other.
        if(Math.abs(leftHeight - rightHeight) > 1) {
            result = false;
        }
        
        int height = Math.max(leftHeight, rightHeight) + 1;
        
        return height;
        
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(n) n is the total number of nodes in the binary tree

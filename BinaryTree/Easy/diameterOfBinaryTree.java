
//https://leetcode.com/problems/diameter-of-binary-tree/

class Solution {
    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfBinaryTree(root); //helper function
        return diameter;
    }
    
    public int heightOfBinaryTree(TreeNode root) {
        if(root == null) { //base condition
            return 0;
        }
        
        //recursive call for both left and right side
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        
        //update the diameter
        diameter = Math.max(diameter, leftHeight + rightHeight); 
        
        //get the height for the current node
        int height = Math.max(leftHeight, rightHeight) + 1;
        
        return height;
        
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(h) h is the height of the binary tree
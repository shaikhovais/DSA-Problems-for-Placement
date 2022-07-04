
//https://leetcode.com/problems/range-sum-of-bst/

class Solution {
    
    int sum = 0; //global variable to store sum
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) {
            return 0;
        }
        
        //if value of current node is in the range then we add it in the 'sum'
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        
        //if the value of current node is less than the high it means we need to move on the side with more value(right side)
        if(root.val < high) {
            rangeSumBST(root.right, low, high);
        }
        
        //if the value of current node is more than the low it means we need to move on the side with less value(left side)
        if(root.val > low) {
            rangeSumBST(root.left, low, high);
        }
        
        return sum;
    }
}

// Time Complexity: O(n), where n is the total number of nodes in the BST.
// Auxiliary Space: O(h), where h is the height of the BST. In the worst case, the BST can be skewed and the space consumed due to recursive call stack can go upto n, where n is the the number of nodes in the BST. 

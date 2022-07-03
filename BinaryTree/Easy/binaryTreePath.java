package Easy;

//https://leetcode.com/problems/binary-tree-paths/

class Solution {
    
    List <String> listOfPaths = new ArrayList <>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        //we use stringbuilder so we don't have to create a new string everytime and instead we can just use append() method
        StringBuilder path = new StringBuilder();
        
        //call helper function with string builder
        binaryTreePathsHelper(root, path);
        return listOfPaths;
    }
    
    public void binaryTreePathsHelper(TreeNode root, StringBuilder path) {
        if(root == null) {
            return;
        }
        
        //we store length so we can come back to our length(line no 54) when we are returning back after adding the left and right node in our list
        int len = path.length();
        
        //add value of current node to our path
        path.append(root.val);
        
        //we check if we reached leaf node
        if(root.left == null && root.right == null) {
            
            //if we are at leaf node then we convert our stringBuilder to string and then add it to our list of paths and move to line no 54
            listOfPaths.add(path.toString());
        } else {
            
            //if we are not at leaf node then we first append '->' to our path and then call function again for left and right side
            path.append("->");
            binaryTreePathsHelper(root.left, path);
            binaryTreePathsHelper(root.right, path);
        }
        
        //after reaching leaf node and adding the path to our list we need to go back to our previous node, so we use .setLength() method of string builder to go back to 'len'(previous node) which we have stored on line no 36.
        path.setLength(len);
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(h) h is the height of the binary tree
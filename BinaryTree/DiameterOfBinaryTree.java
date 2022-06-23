package BinaryTree;

public class DiameterOfBinaryTree {
    //The diameter of a tree is the number of Nodes on the longest path between two leaf Nodes.
    public static void main(String[] args) {                               //               1
        TreeNode root = new TreeNode(1);                             //              /  \
        root.left = new TreeNode(2);                                 //             2    3
        root.right = new TreeNode(3);                                //            / \    \
        root.left.left = new TreeNode(4);                            //           4   5    6
        root.left.right = new TreeNode(5);                           //               /
        root.right.right = new TreeNode(6);                          //              7
        root.left.right.left = new TreeNode(7);                              

        diameter = diameterOfBinaryTree(root);
        System.out.println("Diameter of binary tree is : " + diameter);
    }

    //Creating a variable outside function due to recursive call
    static int diameter = 0;
    
    public static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    
    public static int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        //If current diameter is greater then we update it
        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        int height = Math.max(rightHeight, leftHeight) + 1;
        return height;
    }
}

class TreeNode {

    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
    }
}

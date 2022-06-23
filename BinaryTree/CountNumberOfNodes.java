package BinaryTree;

public class CountNumberOfNodes {
    public static void main(String[] args) {                               //               1                           
        TreeNode root = new TreeNode(1);                             //              /  \      
        root.left = new TreeNode(2);                                 //             2    3       
        root.right = new TreeNode(3);                                //            / \  / \               
        root.left.left = new TreeNode(4);                            //           4   5 6  7               
        root.left.right = new TreeNode(5);                                        
        root.right.left = new TreeNode(6);                                   
        root.right.right = new TreeNode(7); 
        
        int totalNoOfNodes = getCountOfNodes(root);

        System.out.println("Total number of nodes in the tree is : " + totalNoOfNodes);
    }

    public static int getCountOfNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int countOfLeftSubTree = getCountOfNodes(root.left);        //We get count of left subtree
        int countOfRightSubTree = getCountOfNodes(root.right);      //We get count of right subtree
        int totalCountOfNodes = countOfLeftSubTree + countOfRightSubTree + 1; //we add '+1' to include the root node itself

        return totalCountOfNodes;
    }
}

class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }
}

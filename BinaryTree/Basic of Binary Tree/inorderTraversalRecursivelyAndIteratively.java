import java.util.Stack;

public class inorderTraversalRecursivelyAndIteratively {
    public static void main(String[] args) {                               //               1                           
        TreeNode root = new TreeNode(1);                             //              /  \      
        root.left = new TreeNode(2);                                 //             2    3       
        root.right = new TreeNode(3);                                //            / \  / \               
        root.left.left = new TreeNode(4);                            //           4   5 6  7               
        root.left.right = new TreeNode(5);                                        
        root.right.left = new TreeNode(6);                                   
        root.right.right = new TreeNode(7); 
        
        System.out.println("Inorder traversal of the tree using recursion: ");
        inorderTraversalUsingRecursion(root);

        System.out.println();

        System.out.println("Inorder traversal of the tree using iteration: ");
        inorderTraversalUsingIteration(root);

    }

    // Recursive function to perform inorder traversal on the tree
    public static void inorderTraversalUsingRecursion(TreeNode root) {
        // return if the current node is empty
        if (root == null) {
            return;
        }
    
        // Traverse the left subtree
        inorderTraversalUsingRecursion(root.left);

        // Display the data part of the root (or current node)
        System.out.print(root.data + " ");
    
        // Traverse the right subtree
        inorderTraversalUsingRecursion(root.right);
    }

    // Iterative function to perform inorder traversal on the tree
    public static void inorderTraversalUsingIteration(TreeNode root) {
        // return if the tree is empty
        if(root == null) {
            return;
        }

        // create an empty stack and push the root node
        Stack<TreeNode> stack = new Stack<>();
    
        // loop till stack is empty
        while (!stack.empty() || root != null) {

            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }
}

class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }
}
import java.util.Stack;

public class preorderTraversalRecursivelyAndIteratively {
    public static void main(String[] args) {                               //               1                           
        TreeNode root = new TreeNode(1);                             //              /  \      
        root.left = new TreeNode(2);                                 //             2    3       
        root.right = new TreeNode(3);                                //            / \  / \               
        root.left.left = new TreeNode(4);                            //           4   5 6  7               
        root.left.right = new TreeNode(5);                                        
        root.right.left = new TreeNode(6);                                   
        root.right.right = new TreeNode(7); 
        
        System.out.println("Preorder traversal of the tree using recursion: ");
        preorderTraversalUsingRecursion(root);

        System.out.println();

        System.out.println("Preorder traversal of the tree using iteration: ");
        preorderTraversalUsingIteration(root);

    }

    // Recursive function to perform preorder traversal on the tree
    public static void preorderTraversalUsingRecursion(TreeNode root) {
        // return if the current node is empty
        if (root == null) {
            return;
        }
    
        // Display the data part of the root (or current node)
        System.out.print(root.data + " ");
    
        // Traverse the left subtree
        preorderTraversalUsingRecursion(root.left);
    
        // Traverse the right subtree
        preorderTraversalUsingRecursion(root.right);
    }

    // Iterative function to perform preorder traversal on the tree
    public static void preorderTraversalUsingIteration(TreeNode root) {
        // return if the tree is empty
        if (root == null) {
            return;
        }
    
        // create an empty stack and push the root node
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
    
        // loop till stack is empty
        while (!stack.empty()) {
            // pop a node from the stack and print it
            TreeNode curr = stack.pop();
            System.out.print(curr.data + " ");
    
            // push the right child of the popped node into the stack
            if (curr.right != null) {
                stack.push(curr.right);
            }
    
            // push the left child of the popped node into the stack
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            // the right child must be pushed first so that the left child
            // is processed first (LIFO order)
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

import java.util.*;

public class createBinaryTreeUsingQueue {
    static Node root;

    static class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insert(int data) {
        Node node  = new Node(data);

        if(root == null) {
            root = node;
        } else {
            Queue<Node> queue = new LinkedList<>();
            Node temp = root;

            queue.add(temp);

            while (!queue.isEmpty()) {
                temp = queue.poll();

                if(temp.left != null) {
                    queue.add(temp.left);
                } else {
                    temp.left = node;
                    break;
                }

                if(temp.right != null) {
                    queue.add(temp.right);
                } else {
                    temp.right = node;
                    break;
                }
            }
        }
    }

    public static void levelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        Node temp = root;
        int count = 1;
        int x = 1;

        queue.add(temp);

        while (!queue.isEmpty()) {
            temp = queue.poll();
            System.out.print(temp.data + " ");
            count++;
            if(count == Math.pow(2, x)) {
                System.out.println("<-- Level : " + x++);
            }

            if(temp.left != null) {
                queue.add(temp.left);
            }
            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }


    public static void main (String[] args) {
		root = new Node(1);

        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);

        levelOrderTraversal();
    }    
}

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class Binary_tree_Example {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // public void bfs() {
    //     if (root == null) {
    //         return;
    //     }

    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);

    //     while (!queue.isEmpty()) {
    //         Node current = queue.poll();
            
    //         if (current.data == 2) {
    //             System.out.print(current.data + " ");
    //             System.out.print(current.left + " ");
    //             System.out.print(current.right + " ");
    //         }

    //         if (current.left != null) {

    //             queue.add(current.left);
    //         }

    //         if (current.right != null) {
    //             queue.add(current.right);
    //         }
    //     }
    // }


      // BFS with Level Printing
      public void bfsWithLevels() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes in the current level

            // Process all nodes in the current level
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                // Add left and right children to the queue
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println(); // Move to the next line after processing a level
        }
    }


    public static void main(String[] args) {
        Binary_tree_Example tree = new Binary_tree_Example();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\nBFS traversal:");
        // tree.bfs();
        tree.bfsWithLevels();
    }
}

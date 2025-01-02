import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class MinOperationsSortTree {

    // Function to calculate the minimum number of swaps to sort an array
    private int minSwapsToSort(List<Integer> level) {
        int n = level.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = level.get(i);

        // Pair each value with its index and sort by value
        int[][] arrWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrWithIndex[i][0] = arr[i];
            arrWithIndex[i][1] = i;
        }
        Arrays.sort(arrWithIndex, Comparator.comparingInt(a -> a[0]));

        // Calculate the minimum swaps using cycle decomposition
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arrWithIndex[i][1] == i) continue;

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrWithIndex[j][1];
                cycleSize++;
            }
            swaps += (cycleSize - 1);
        }
        return swaps;
    }

    public int minimumOperations(TreeNode root) {
        if (root == null) return 0;

        // Perform level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int totalSwaps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            // Calculate minimum swaps to sort the current level
            totalSwaps += minSwapsToSort(level);
        }

        return totalSwaps;
    }

    // Helper function to create a tree from an array
    public static TreeNode createTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        MinOperationsSortTree solution = new MinOperationsSortTree();

        // Test case 1
        Integer[] values1 = {1, 4, 3, 7, 6, 8, 5, null, null, null, null, 9, null, 10};
        TreeNode root1 = createTree(values1);
        System.out.println("Minimum operations: " + solution.minimumOperations(root1)); // Output: 3

        // Test case 2
        Integer[] values2 = {1, 3, 2, 7, 6, 5, 4};
        TreeNode root2 = createTree(values2);
        System.out.println("Minimum operations: " + solution.minimumOperations(root2)); // Output: 3

        // Test case 3
        Integer[] values3 = {1, 2, 3, 4, 5, 6};
        TreeNode root3 = createTree(values3);
        System.out.println("Minimum operations: " + solution.minimumOperations(root3)); // Output: 0
    }
}

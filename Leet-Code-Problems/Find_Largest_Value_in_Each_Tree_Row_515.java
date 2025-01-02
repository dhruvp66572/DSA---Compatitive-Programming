import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Find_Largest_Value_in_Each_Tree_Row_515 {

    public List<Integer> getmaximum(TreeNode root) {
        List<Integer> maximumlist = new ArrayList<>();

        if (root == null)
            return maximumlist;

        // Perform level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            // maximum[i]
            System.out.println(level);
            maximumlist.add(getmax(level));
        }

        System.out.println(maximumlist);
        return maximumlist;
    }

    private Integer getmax(List<Integer> level) {
        Collections.sort(level,Collections.reverseOrder());
        // System.out.println(level.get(0));
        return level.get(0);
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
        Find_Largest_Value_in_Each_Tree_Row_515 solution = new Find_Largest_Value_in_Each_Tree_Row_515();

        // Test case 1
        Integer[] values1 = { 1, 3, 2, 5, 3, null, 9 };
        TreeNode root1 = createTree(values1);

        int ans[] = solution.getmaximum(root1);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        // // Test case 2
        // Integer[] values2 = {1,2,3};
        // TreeNode root2 = createTree(values2);
        // System.out.println("Minimum operations: " + solution.getmaximum(root2)); //
        // Output: 3

    }

}

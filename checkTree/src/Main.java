
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuilder delete = stringBuilder.delete(0, 3);
        delete.toString();
        System.out.println(delete);
    }
}


class Solution {
    public boolean checkTree(TreeNode root) {

        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

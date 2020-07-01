import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/2 00:09
 */
public class BinaryTreeInorderTraversal {
    static class ColorNode {
        Integer color;
        TreeNode treeNode;
        public ColorNode(Integer color, TreeNode treeNode){
            this.color = color;
            this.treeNode = treeNode;
        }

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        int WHITE= 0,  GRAY = 1;

        List<Integer> res = new ArrayList<>();

        Stack<ColorNode> stack = new Stack<>();
        stack.push(new ColorNode(WHITE, root));

        while (!stack.empty()) {
            ColorNode pop = stack.pop();
            Integer color = pop.color;
            TreeNode treeNode = pop.treeNode;
            if (treeNode == null) continue;

            if (color == WHITE) {
                stack.push(new ColorNode(WHITE, treeNode.right));
                stack.push(new ColorNode(GRAY, treeNode));
                stack.push(new ColorNode(WHITE, treeNode.left));
            } else if (color == GRAY){
                res.add(treeNode.val);
            }
        }

        return res;

    }
}

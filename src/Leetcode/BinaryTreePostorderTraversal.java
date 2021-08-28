package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution3 {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> postorder = new ArrayList<>();
		postorder(postorder, root);
		return postorder;
	}

	public void postorder(List<Integer> postorder, TreeNode root) {
		if (root == null)
			return;

		postorder(postorder, root.left);
		postorder(postorder, root.right);
		postorder.add(root.val);
	}
}
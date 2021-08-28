package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

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

class Solution2 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> inorder = new ArrayList<>();
		inorder(inorder, root);
		return inorder;
	}

	public void inorder(List<Integer> inorder, TreeNode root) {
		if (root == null)
			return;

		inorder(inorder, root.left);
		inorder.add(root.val);
		inorder(inorder, root.right);
	}
}
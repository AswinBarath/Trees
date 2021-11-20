package tree_traversals;

// Time Complexity: O(N)
// Space Complexity: O(N)
//- In worst case, the tree is skewed (Vertical linked list)
// - Auxiliary space used in Recursion

public class Postorder_traversal {

	// Left - Right - Root
	public static void postorder_traversal(Node root) {
		if (root == null)
			return;

		postorder_traversal(root.left);
		postorder_traversal(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.right.left = new Node(7);
		root.right.right = new Node(8);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		postorder_traversal(root); // 4 6 5 2 7 9 10 8 3 1
	}

}

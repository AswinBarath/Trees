package tree_traversals;

// Time Complexity: O(N)
// Space Complexity: O(N)
//- In worst case, the tree is skewed (Vertical linked list)
// - Auxiliary space used in Recursion

public class Preorder_traversal {

	// Root - Left - Right
	public static void preorder_traversal(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preorder_traversal(root.left);
		preorder_traversal(root.right);
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
		preorder_traversal(root); // 1 2 4 5 6 3 7 8 9 10
	}

}

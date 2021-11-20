package tree_implementations;

public class BasicNode {

	int data;
	Node left;
	Node right;

	public BasicNode(int key) {
		this.data = key;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
	}

}

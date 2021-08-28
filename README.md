# Trees 

- Trees are hierarchical data structures, compared with Arrays, Stacks, Queues, Linked lists which are linear data structures
- A hierarchy can be observed in our folder structure


## Key terminologies

<p>
<img src="https://miro.medium.com/max/975/1*PWJiwTxRdQy8A_Y0hAv5Eg.png" alt="Tree data structure" />
</p>


## Introduction to Binary Trees

- A node in a binary tree can contain at max only two nodes as children


### Types of Binary Trees

<p>
<img src="https://miro.medium.com/max/16000/1*CMGFtehu01ZEBgzHG71sMg.png" alt="Types of tree data structure" />
</p>

#### 1. Full Binary Tree
- Every node in this tree will either have 0 or 2 children
- Example of Full Binary Tree
<p>
<img src="https://web.cecs.pdx.edu/~sheard/course/Cs163/Graphics/FullBinary.jpg" alt="Full Binary Tree data structure" />
</p>

#### 2. Complete Binary Tree
- All levels are completely filled except the last level
- The last level has all nodes as left as possible
- Example of Complete Binary Tree
<p>
<img src="https://www.techiedelight.com/wp-content/uploads/Complete-Binary-Tree.png" alt="Complete Binary Tree data structure" />
</p>

#### 3. Perfect Binary Tree
- All leaf are at the same level
- Examples of Perfect Binary Tree
<p>
<img src="https://cdn.programiz.com/sites/tutorial2program/files/perfect-binary-tree-rec.png" alt="Perfect Binary Tree data structure" />
</p>
<p>
<img src="https://adrianmejia.com/images/full-complete-perfect-binary-tree.jpg" alt="Perfect Binary Tree data structure" />
</p>
<p>
<img src="https://codepumpkin.com/wp-content/uploads/2018/08/Perfect_Binary_Tree.jpg" alt="Perfect Binary Tree data structure" />
</p>

#### 4. Balanced Binary Tree
- The height of the tree should be at maximum of Log(N), where N is no. of nodes
- Examples of Balanced Binary Tree
<p>
<img src="https://codepumpkin.com/wp-content/uploads/2018/08/Balanced_Binary_Tree.jpg" alt="Balanced Binary Tree data structure" />
</p>
<p>
<img src="https://i.stack.imgur.com/n2CFS.png" alt="Balanced Binary Tree data structure" />
</p>

#### 5. Degenerate/ Skewed Binary Tree
- A binary tree, which is dominated solely by left child nodes or right child nodes, is called a skewed binary tree, more specifically left skewed binary tree, or right skewed binary tree.
- Examples of Degenerate/ Skewed Binary Tree
<p>
<img src="https://www.gatevidyalay.com/wp-content/uploads/2018/07/Skewed-Binary-Tree-Example.png" alt="Degenerate/ Skewed Binary Tree data structure" />
</p>
<p>
<img src="https://codepumpkin.com/wp-content/uploads/2018/08/Left_Right_Skewed_Tree.jpg" alt="Degenerate/ Skewed Binary Tree data structure" />
</p>
<hr />
<p>
<img src="https://d2uusema5elisf.cloudfront.net/books/javascript-algorithms/images/06-binary-search-tree/binary-tree-types.png" alt="Binary Tree data structure" />
</p>
<hr />


## Traversal Techniques (BFS | DFS)

- Depth-first search (DFS) - Inorder Traversal, Preorder Traversal, Postorder Traversal 

### Inorder Traversal 
- Left - Root - Right 

### Preorder Traversal 
- Root - Left - Right 

### Postorder Traversal 
- Left - Right - Root 

<hr />
<p>
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Preorder-from-Inorder-and-Postorder-traversals.jpg" alt="Traversal Techniques" />
</p>
<hr />

- Breadth-first Search (BFS) - Level Order Traversal 

<hr />
<p>
<img src="https://examradar.com/wp-content/uploads/2016/10/pre-post-inorder-and-level-order.png" alt="Traversal Techniques" />
</p>
<hr />


## Pre-order traversal

- Pre-order traversal follows a depth-first search appraoch
- We visit the nodes in this format **(Root - Left - Right)**
- Java Code
```
	public static void preorder_traversal(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preorder_traversal(root.left);
		preorder_traversal(root.right);
	}
```
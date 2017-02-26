public class SearchTree<E extends Comparable<E>> {
	private SearchTreeNode<E> overallRoot;

	// post: constructs an empty tree
	public SearchTree() {
		overallRoot = null;
	}

	// pre : the tree satisfies the binary search tree property
	// post: value is added so as to preserve the binary search tree property
	public void add(E value) {
		overallRoot = add(overallRoot, value);
	}

	// pre : the tree with given root satisfies the binary search tree property
	// post: value is added so as to preserve the binary search tree property
	private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
		if (root == null)
			root = new SearchTreeNode<E>(value);
		//		else if (value <= root.data)
		else if (value.compareTo(root.data) <= 0)
			root.left = add(root.left, value);
		else
			root.right = add(root.right, value);
		return root;
	}

	// post: prints the data of the tree, one per line
	public void print() {
		printInorder(overallRoot);
	}

	// post: prints in inorder the data fields of the tree with given root
	private void printInorder(SearchTreeNode<E> root) {
		if (root != null) {
			printInorder(root.left);
			System.out.println(root.data);
			printInorder(root.right);
		}
	}
}
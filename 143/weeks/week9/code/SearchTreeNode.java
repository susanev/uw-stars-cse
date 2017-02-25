public class SearchTreeNode<E> {
	public E data;		  // data stored at this SearchTreeNode<E>
	public SearchTreeNode<E> left;  // reference to left subtree
	public SearchTreeNode<E> right; // reference to right subtree

	// post: constructs a leaf node with given data
	public SearchTreeNode(E data) {
		this(data, null, null);
	}
		
	// post: constructs a SearchTreeNode<E> with the given data and links
	public SearchTreeNode(E data, SearchTreeNode<E> left, SearchTreeNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
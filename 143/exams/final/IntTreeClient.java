// Short program that demonstrates the use of the IntTree class.

public class IntTreeClient {
    //                  tree before call
    //                     +---+
    //                     | 0 |
    //                     +---+
    //                    /       \
    //                  /           \
    //           +---+               +---+
    //           | 3 |               | 0 |
    //           +---+               +---+
    //          /     \             /     \
    //         /       \           /       \
    //      +---+     +---+     +---+     +---+
    //      | 4 |     | 2 |     | 5 |     | 9 |
    //      +---+     +---+     +---+     +---+
    //     /         /         /         /     \
    //    /         /         /         /       \
    // +---+     +---+     +---+     +---+     +---+
    // | 7 |     | 6 |     | 1 |     | 8 |     | 3 |
    // +---+     +---+     +---+     +---+     +---+                   


    //             tree after call
    //                 +---+
    //                 | 0 |
    //                 +---+
    //               /       \
    //             /           \
    //       +---+               +---+
    //       | 3 |               | 0 |
    //       +---+               +---+
    //            \                   \
    //             \                   \
    //            +---+               +---+
    //            | 2 |               | 9 |
    //            +---+               +---+
    //                                     \
    //                                      \
    //                                     +---+
    //                                     | 3 |
    //                                     +---+
    public static void main(String[] args) {
        IntTree t = new IntTree(12);
        System.out.println("Tree structure:");
        t.printSideways();
        // System.out.println();
        // t.printPreorder();
        // t.printInorder();
        // t.printPostorder();
    }
}

// Simple binary tree class that includes methods to construct a tree of ints,
// to print the structure, and to print the data using a preorder, inorder or
// postorder traversal.  The trees built have nodes numbered starting with 1
// and numbered sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."

class IntTree {
    private IntTreeNode overallRoot;

    // pre : max >= 0 (throws IllegalArgumentException if not)
    // post: constructs a sequential tree with given number of nodes
    public IntTree(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = new IntTreeNode(0, new IntTreeNode(3, null, new IntTreeNode(2)), new IntTreeNode(0, null, new IntTreeNode(9, null, new IntTreeNode(3))));
        //overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless n is greater
    //       than max, in which case it returns an empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            IntTreeNode left = buildTree(2 * n, max);
            IntTreeNode right = buildTree(2 * n + 1, max);
            return new IntTreeNode(n, left, right);
        }
    }

    public void removeLeftLeaves() {
        removeLeftLeaves(overallRoot, false);
    }

    private IntTreeNode removeLeftLeaves(IntTreeNode root, boolean left) {
        if (root != null) {
            root.left = removeLeftLeaves(root.left, true);
            removeLeftLeaves(root.right, false);
            if (left && root.left == null && root.right == null) {
                root = null;
            }
        }
        return root;
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using an inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an inorder
    //       traversal and using indentation to indicate node depth; prints
    //       right to left so that it looks correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given root, indenting
    //       each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
}

class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;
                
    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                        
    // constructs a branch node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left, 
                       IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
// Short program that demonstrates the use of the IntTree class.

public class IntTreeClient {
    public static void main(String[] args) {
        IntTree t = new IntTree(12);
        System.out.println("Tree structure:");
        t.printSideways();
        System.out.println();
        t.printPreorder();
        t.printInorder();
        t.printPostorder();
    }
}
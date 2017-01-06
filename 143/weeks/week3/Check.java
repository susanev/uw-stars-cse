public class Check {
	public static void main (String [] args) {
		ListNode p = new ListNode(1, new ListNode(3));
		ListNode q = new ListNode(2);
		printList(p);
		printList(q);

		q.next = p.next;
		p.next = q;

		printList(p);
		printList(q);
	}

	public static void printList(ListNode list) {
		ListNode curr = list;
		while (curr != null) {
			System.out.print(curr.data + ", ");
			curr = curr.next;
		}
		System.out.println("\n---");
	}
}

class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
      this.data = data;
      this.next = next;
  }
}
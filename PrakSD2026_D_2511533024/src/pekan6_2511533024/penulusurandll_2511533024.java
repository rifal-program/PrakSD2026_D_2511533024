package pekan6_2511533024;


public class penulusurandll_2511533024 {
	static void forwardTraversal(nodedll_2511533024 head) {
		nodedll_2511533024 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " <-> ");
			curr = curr.next;
		}
		System.out.println();
	}
	 static void backwardTraversal(nodedll_2511533024 tail) {
		 nodedll_2511533024 curr = tail;
		 while (curr != null) {
			 System.out.print(curr.data + " <-> ");
			 curr = curr.prev;
		 }
		 System.out.println();
	 }
	 public static void main (String [] args) {
		 nodedll_2511533024 head = new nodedll_2511533024(1);
		 nodedll_2511533024 second = new nodedll_2511533024(2);
		 nodedll_2511533024 third = new nodedll_2511533024(3);
		 
		 head.next = second;
		 second.prev = head;
		 second.next = third;
		 third.prev = second;
		 
		 System.out.println("penelusuran maju : ");
		 forwardTraversal(head);
		 
		 System.out.println("penelusuran mundur : ");
		 backwardTraversal(third);
	}
}

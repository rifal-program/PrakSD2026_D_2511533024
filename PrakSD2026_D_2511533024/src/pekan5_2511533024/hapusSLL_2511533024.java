package pekan5_2511533024;

public class hapusSLL_2511533024 {
	public static NodeSLL_2511533024 deleteHead_3024(NodeSLL_2511533024 head_3024) 
	{
		if (head_3024 == null)
		 return null;
	 head_3024 = head_3024.next_3024;
	 return head_3024;}

	 public static NodeSLL_2511533024 removeLastNode ( NodeSLL_2511533024 head_3024) {
		 if (head_3024 == null) {
			 return null;}
	
		 if (head_3024.next_3024 == null) {
			 return null;
		 }
		 NodeSLL_2511533024 secondLast = head_3024;
		 while (secondLast.next_3024.next_3024 != null) {
			 secondLast = secondLast.next_3024;
		 }
		 secondLast.next_3024 = null;
		 
		 return head_3024; }
	 
	 
	 
		 public static NodeSLL_2511533024 deleteNode(NodeSLL_2511533024 head_3024, int position_3024) 
		 {
			 NodeSLL_2511533024 temp = head_3024;
			 NodeSLL_2511533024 prev = null;
			 
			 if (temp == null)
				 return head_3024;
			 
			 if (position_3024 == 1) {
				 head_3024 = temp.next_3024;
				 return head_3024;
			}
			 
			for (int i = 1; temp != null && i < position_3024; i++) {
				 prev = temp;
				 temp = temp.next_3024; 
			}
			 
			if (temp != null ) {
				prev.next_3024 = temp.next_3024;
			}
			else 
			{
				System.out.println("data tidak ada");
				return head_3024; 
			}
			
			return head_3024;
			
		 }
				 
			 
	       	 public static void printList_3024(NodeSLL_2511533024 head_3024) {
					 NodeSLL_2511533024 curr = head_3024;
					 while (curr.next_3024 != null) {
						 System.out.print(curr.data_3024 + "-->");
						 curr = curr.next_3024;
						 if (curr.next_3024 == null) {
							 System.out.print(curr.data_3024);
							 System.out.println(); }
						 }
	       	 }
	       	 public static void main (String [] args) {
	       		 NodeSLL_2511533024 head_3024 = new NodeSLL_2511533024 (1);
	       		 head_3024.next_3024 = new NodeSLL_2511533024 (2);
	       				head_3024.next_3024.next_3024 = new NodeSLL_2511533024 (3);
	       						head_3024.next_3024.next_3024.next_3024 = new NodeSLL_2511533024 (4);
	       								head_3024.next_3024.next_3024.next_3024.next_3024 = new NodeSLL_2511533024 (5);
	       										head_3024.next_3024.next_3024.next_3024.next_3024.next_3024= new NodeSLL_2511533024 (6);
	       						System.out.println("list awal");
	       						printList_3024(head_3024);
	       						head_3024 = deleteHead_3024(head_3024);
	       						System.out.println("list setelah head dihapus");
	       						printList_3024(head_3024);
	       						head_3024 = removeLastNode (head_3024);
	       						System.out.println("list setelah simpul terakhir dihapus:");
	       						printList_3024 (head_3024);
	       						int position_3024 = 2;
	       						head_3024 = deleteNode(head_3024,position_3024);
	       						System.out.println("list setelah posisi2 dihapus :");
	       						printList_3024(head_3024);
	       	 }
}	 


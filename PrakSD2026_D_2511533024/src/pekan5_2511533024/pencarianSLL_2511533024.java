	package pekan5_2511533024;
	
	public class pencarianSLL_2511533024 {
	 static boolean searchKey (NodeSLL_2511533024 head_3024, int key_3024) {
		 NodeSLL_2511533024 curr = head_3024;
		 while (curr != null) {
			 if (curr.data_3024 == key_3024)
				 return true;
			 curr = curr.next_3024; }
		 return false; }
	 public static void traversal (NodeSLL_2511533024 head_3024) {
		 NodeSLL_2511533024 curr = head_3024;
		 while (curr != null) {
			 System.out.print(" " + curr.data_3024);
			 curr = curr.next_3024; }
		 System.out.println(); }
	 public static void main (String [] args) {
		 NodeSLL_2511533024 head_3024 = new NodeSLL_2511533024(14);
		 head_3024.next_3024 = new NodeSLL_2511533024(21);
		 head_3024.next_3024.next_3024 = new NodeSLL_2511533024(13);
		 head_3024.next_3024.next_3024.next_3024 = new NodeSLL_2511533024(30);
		 head_3024.next_3024.next_3024.next_3024.next_3024 = new NodeSLL_2511533024(10);
		 System.out.print("penulusuran sll : ");
		 traversal (head_3024);
		 int key_3024 = 30;
		 System.out.print("cari data " + key_3024 + " = ");
		 if (searchKey (head_3024, key_3024))
			 System.out.println("ketemu");
		 else 
			 System.out.println("tidak ada");
			 }
	 }
	 
	

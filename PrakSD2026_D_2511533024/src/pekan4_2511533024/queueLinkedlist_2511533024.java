package pekan4_2511533024;
import java.util.LinkedList;
import java.util.Queue;

public class queueLinkedlist_2511533024 {
	public static void main (String [] args) {
		Queue<Integer> q_3024 = new LinkedList<>();
		for (int i = 0; i < 6; i++)
			q_3024.add(i);
		System.out.println("Elemen Antrian" + q_3024);
		int hapus = q_3024.remove();
		System.out.println("hapus elemen = " + hapus);
		System.out.println(q_3024);
		int depan = q_3024.peek();
		System.out.println("kepala antrian ="+ depan);
		int banyak = q_3024.size();
		System.out.println("size antrian =" + banyak);
	}
}

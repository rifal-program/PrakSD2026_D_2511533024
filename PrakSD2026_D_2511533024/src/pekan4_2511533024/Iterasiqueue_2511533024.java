package pekan4_2511533024;
import java.util.*;


	public class Iterasiqueue_2511533024 {
	public static void main (String [] args) {
		Queue<String> q_3024 = new LinkedList<>();
		q_3024.add("pratikum");
		q_3024.add("struktur");
		q_3024.add("data");
		q_3024.add("dan");
		q_3024.add("algoritma");
		Iterator<String> iterator = q_3024.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
	}
	}

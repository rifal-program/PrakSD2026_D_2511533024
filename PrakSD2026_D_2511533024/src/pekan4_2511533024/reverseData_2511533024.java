	package pekan4_2511533024;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Stack;
	public class reverseData_2511533024 {
	public static void main (String [] args) {
		Queue<Integer> q_3024 = new LinkedList<>();
		q_3024.add(1);
		q_3024.add(2);
		q_3024.add(3);
		System.out.println("sebelum reverse" + q_3024);
		Stack<Integer> S = new Stack<Integer>();
		while (!q_3024.isEmpty()) {
			S.push(q_3024.remove());
			
		}
		while (!S.isEmpty()) {
			q_3024.add(S.pop());
	}
		System.out.println("sesudah reverse = "+ q_3024);
	}
}

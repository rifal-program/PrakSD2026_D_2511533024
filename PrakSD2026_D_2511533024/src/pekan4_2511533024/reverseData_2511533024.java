	package pekan4_2511533024;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Stack;
	public class reverseData_2511533024 {
	public static void main (String [] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("sebelum reverse" + q);
		Stack<Integer> S = new Stack<Integer>();
		while (!q.isEmpty()) {
			S.push(q.remove());
			
		}
		while (!S.isEmpty()) {
			q.add(S.pop());
	}
		System.out.println("sesudah reverse = "+ q);
	}
}

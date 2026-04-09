package pekan3_2511533024;
import java.util.Stack;
public class NilaiMaksimum_2511533024 {
 public static int Max_2511533024(Stack<Integer> s) {
	 Stack<Integer> backup_3024= new Stack<Integer>();
	 int maxvalue_3024 = s.pop();
	 backup_3024.push(maxvalue_3024);
	 while(!s.isEmpty()) {
		 int Next = s.pop();
		 backup_3024.push(Next);
		 maxvalue_3024 = Math.max(maxvalue_3024, Next);
	 }
	 while (!backup_3024.isEmpty()) {
		 s.push(backup_3024.pop());
		}
	 return maxvalue_3024;
 }
 public static void main ( String [] args) {
	 Stack <Integer> s = new Stack<Integer>();
	 s.push(70);
	 s.push(120);
	 s.push(20);
	 System.out.println("isi stack "+ s);
	 System.out.println("stack teratas" + s.peek());
	 System.out.println("nilai maksimum" + Max_2511533024(s));
 }
}

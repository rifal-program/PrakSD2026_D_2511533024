package pekan3_2511533024;
import java.util.*;
public class siswaStack_2511533024 {
	 private ArrayList<siswa_2511533024> stack;
 
	 public siswaStack_2511533024 () {
		 stack = new ArrayList<>();
	 }
	 public void push(siswa_2511533024 mhs) {
		 stack.add(mhs);
	}
	 
	 public siswa_2511533024 pop() {
		 if (!isEmpty()) {
			 return stack.remove(stack.size() - 1);
		 }
		 return null;
	}
	 
	 public siswa_2511533024 peek() {
		 if (!isEmpty()) {
			 return stack.get(stack.size() - 1);
		 }
		 return null;
	 }
	 public boolean isEmpty() {
		 return stack.isEmpty();
	 }
	 public void tampilkansiswa_2511533024() {
		 for(int i = stack.size() - 1; i >= 0; i--) {
		System.out.println(stack.get(i));
		 }
	 }
	 public static void main ( String [] args) {
		 siswaStack_2511533024 studentStack = new siswaStack_2511533024();
		 siswa_2511533024 mhs1 = new siswa_2511533024("ali",1);
		 siswa_2511533024 mhs2 = new siswa_2511533024("boby",2);
		 siswa_2511533024 mhs3 = new siswa_2511533024("charles",3);
		 studentStack.push(mhs1);
		 studentStack.push(mhs2);
		 studentStack.push(mhs3);
		 System.out.println("siswa di dalam stack :");
		 studentStack.tampilkansiswa_2511533024();
		 System.out.println("siswa teratas "+ studentStack.peek());
		 System.out.println("mengeluarkan siswa teratas dari stack: "+ studentStack.pop());
		 System.out.println("daftar siswa setelah di pop: ");
		 studentStack.tampilkansiswa_2511533024();
	 }
 }


package pekan2_2511533024;
import java.util.ArrayList;

public class Arraylist1_2511533024 {
	public static void main (String[] args) {
	// size of the arraylist
		int n = 5;
		//declaring the arraylist with initial size n
		ArrayList<Integer> arrli = new ArrayList<>();
		//Appending new elements at the end of the last
		for (int i = 1;i <= n; i++)
			arrli.add(i);
		//printing elemnets
		System.out.println(arrli);
		//remove elements at index 3
		arrli.remove(3);
		//displayying the arraylist
		//after delletions
		System.out.println(arrli);
		//printing elements one by one
		for (int i = 0; i<arrli.size(); i++)
			System.out.print(arrli.get(i)+ " ");
	}
}

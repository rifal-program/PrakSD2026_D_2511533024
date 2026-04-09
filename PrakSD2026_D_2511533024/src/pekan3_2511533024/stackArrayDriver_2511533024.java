package pekan3_2511533024;

public class stackArrayDriver_2511533024 {
 public static void main ( String [] args) {
	 stackArray_2511533024 s = new stackArray_2511533024();
	 s.push(10);
	 s.push(20);
	 s.push(30);
	 System.out.println(s.pop() + " dikeluarkan dari stack ");
	 System.out.println("elemen teratas adalah : " + s.peak());
	 System.out.print("elemen pada stack : ");
	 s.print();
 }
}

package pekan1_2511533024;

public class JamDriver1_2551533024 {
	
		public static void main(String[] Args) {
			jam_2511533024 a = new jam_2511533024(23, 59, 50);
			jam_2511533024 b = new jam_2511533024(0,0, 15);
			System.out.println("a              = " + a);
			System.out.println("b              = " + b);
			System.out.println("a+b            = " + a.plus(b));
			System.out.println("next 20s       = " + a.nextNseconds(20));
			System.out.println("durasi(a,b)    = " + jam_2511533024.durasiDetik(a, b));
			System.out.println("a.compareTo(b) = " + a.compareTo(b));
		}
	}


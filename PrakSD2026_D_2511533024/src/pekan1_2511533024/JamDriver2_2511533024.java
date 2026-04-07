package pekan1_2511533024;
import java.util.Scanner;
public class JamDriver2_2511533024 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner (System.in);
			System.out.println("=== Program Driver Objek Jam ===");
			
			System.out.println("\n--- Input Jam 1 ---");
			jam_2511533024 j1 = buatJamDariInput(input);
			
			System.out.println("\n--- Input Jam 2 ---");
			jam_2511533024 j2 = buatJamDariInput(input);
			
			System.out.println("\n--- Hasil Operasi ---");
			System.out.println("Jam 1 (string) : " + j1.toString());
			System.out.println("Jam 2 (string) : " + j2.toString());
			System.out.println("Jam 1 dalam detik : " + j1.toSeconds());
			System.out.println("Jam 2 dalam detik : " + j2.toSeconds());
			
			int perbandingan = j1.compareTo(j2);
			if (perbandingan > 0) {
				System.out.println("Status : Jam 1 lebih lambat (setelah) Jam 2");
			} else if (perbandingan < 0 ) {
				System.out.println("Status : Jam 1 lebih awal (sebelum) Jam 2");
			} else {
				System.out.println("Status : Jam 1 dan Jam 2 sama persis");
			}
			
			System.out.println("Durasi (j1 ke j2) : " + jam_2511533024.durasiDetik(j1, j2) + " detik");
			
			jam_2511533024 jNext = j1.nextSecond();
			System.out.println("Jam 1 detik berikutnya : " + jNext);
			
			jam_2511533024 jPrev = j1.prevSecond();
			System.out.println("Jam 1 detik sebelumnya : " + jPrev);
			
			jam_2511533024 jHasilPlus = j1.plus(j2);
			System.out.println("Hasil j1 + j2 : " + jHasilPlus);
			
			input.close();
			System.out.println("\nProgram Selesai");
		}
		
		private static jam_2511533024 buatJamDariInput(Scanner sc) {
			int h, m, s;
			while (true) {
				System.out.print("Masukkan Jam (0 - 23) : ");
				h = sc.nextInt();
				System.out.print("Masukkan Menit (0 - 59) : ");
				m = sc.nextInt();
				System.out.print("Masukkan Detik (0 - 59) : ");
				s = sc.nextInt();
				
				if(jam_2511533024.isValid(h, m, s) ) {
					return new jam_2511533024(h, m, s);
				} else {
					System.out.println("[ERROR] Input tidak valid! silahkan di ulang.\n");
				}
			}
		}

	}


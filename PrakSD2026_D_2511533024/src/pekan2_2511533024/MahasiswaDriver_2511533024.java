package pekan2_2511533024;
import java.util.ArrayList;
import java.util.Scanner;
public class MahasiswaDriver_2511533024 {
//metod untuk menampilkan menu
	public static void tampilkanmenu() {
	System.out.println("\nmenu:");
	System.out.println("1.tambah mahasiswa");
	System.out.println("2.tampilkan semua mahasiswa");
	System.out.println("3.hapus mahasiswa berdasarkan nim");
	System.out.println("4.cari mahasiswa berdasarkan nim");
	System.out.println("5.keluar");
	}	


	public static void tambahMahasiswa_2511533024(ArrayList<Mahasiswa_2511533024> list, Scanner sc) {
		System.out.print("Mahasiswa nim:");
		String nim = sc.nextLine();
		System.out.print("Masuka nama:");
		String nama = sc.nextLine();
		System.out.print("Masukan prodi:");
		String prodi =sc.nextLine();
		list.add(new Mahasiswa_2511533024(nim,nama,prodi));
		System.out.println("Mahasiswa berhasil ditambahakan.");
	}

	
	public static void tampilkansemuaMahasiswa_2511533024(ArrayList<Mahasiswa_2511533024> list) {
		if (list.isEmpty()) {
			System.out.println("daftar mahasiswa kosong.");
		} else {
			for (Mahasiswa_2511533024 mhs : list) {
				System.out.println(mhs);
				
			}
		}
	}
	
	public static void hapusMahasiswa_2511533024(ArrayList<Mahasiswa_2511533024> list, Scanner sc) {
		System.out.println("masuka NIm yang akan dihapus: ");
		String nimhapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimhapus));
		if (removed) {
			System.out.println("data dengan nim" + nimhapus + "berhasil dihapus.");
		}else { 
			System.out.println("nim tidak ditemukan.");
		}
	}


	public static void cariMahasiswa_2511533024(ArrayList<Mahasiswa_2511533024> list, Scanner sc) {
		System.out.println("masukan nim yang dicari:");
		String nimcari = sc.nextLine();
		boolean ditemukan = false;
		for(Mahasiswa_2511533024 mhs :list) {
			if (mhs.nim.equals(nimcari) ) {
				System.out.println("hasil pencarian: " + mhs);
				ditemukan = true;
				break;
			}
		}
		if (!ditemukan) {
			System.out.println("nim tidak ada.");
			
		}
	}
	public static void main (String [] args) {
		ArrayList<Mahasiswa_2511533024> mahasiswaList = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		int choice;
		 
		do {
			tampilkanmenu();
			System.out.print("pilih menu:");
			choice = scanner.nextInt();		
			scanner.nextLine();
			
			switch (choice) {
			case 1: 
				tambahMahasiswa_2511533024(mahasiswaList,scanner);
				break;
			case 2: 
				tampilkansemuaMahasiswa_2511533024(mahasiswaList);
				break;
			case 3: 
				hapusMahasiswa_2511533024(mahasiswaList,scanner);
				break;
			case 4: 
				cariMahasiswa_2511533024(mahasiswaList,scanner);
				break;
			case 5: 
				System.out.println("keluar dari program");
				break;
				default: 
					System.out.println("pilihan tidak valid.");
				
			}
	}while (choice !=5);
		scanner.close();
	}
}
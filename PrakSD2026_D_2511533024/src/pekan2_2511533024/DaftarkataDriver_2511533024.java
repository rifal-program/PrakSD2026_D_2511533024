package pekan2_2511533024;

public class DaftarkataDriver_2511533024 {

	    public static void main(String[] args) {
	        Daftarkata_2511533024 al = new Daftarkata_2511533024();

	        // Menambah elemen (akhir)
	        al.tambah("Kami");
	        al.tambah("Informatika");

	        // Menyisipkan elemen pada indeks 1
	        al.tambahpada(1, "Mahasiswa");

	        // Cetak isi awal
	        System.out.println("Awal : " + al);

	        // Mengubah elemen (index 1)
	        al.ubahElemen(1, "Departemen");
	        System.out.println("Setelah Ubah: " + al);

	        // Menghapus elemen (hapus index 0)
	        String terhapus = al.hapusElemen(0);
	        System.out.println("Terhapus : " + terhapus);
	        System.out.println("Setelah Hapus: " + al);

	        // Iterasi pada ArrayList (cetak setiap elemen)
	        System.out.print("Iterasi:");
	        al.iterasicetak();
	        System.out.println();
	    }

	}


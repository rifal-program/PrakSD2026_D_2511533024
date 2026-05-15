package pekan6_2511533024;
import java.util.Scanner;

//Kelas Musik berisi operasi playlist dan method main
public class Musik_2511533024 {
 private Lagu_2511533024 head_3024;
 private Lagu_2511533024 tail_3024;

 // Constructor
 public Musik_2511533024() {
     head_3024 = null;
     tail_3024 = null;
 }

 // 1. Tambah lagu di AKHIR playlist
 public void tambahLagu_3024(String judul, String penyanyi) {
     Lagu_2511533024 baru = new Lagu_2511533024(judul, penyanyi);
     if (head_3024 == null) {
         head_3024 = tail_3024 = baru;
     } else {
         tail_3024.setNext_3024(baru);
         baru.setPrev_3024(tail_3024);
         tail_3024 = baru;
     }
     System.out.println("Lagu berhasil ditambahkan!");
 }

 // 2. Hapus lagu pertama (head)
 public void hapusLaguAwal_3024() {
     if (head_3024 == null) {
         System.out.println("Playlist kosong, tidak ada lagu yang dihapus.");
         return;
     }
     if (head_3024 == tail_3024) {
         head_3024 = tail_3024 = null;
     } else {
         head_3024 = head_3024.getNext_3024();
         head_3024.setPrev_3024(null);
     }
     System.out.println("Lagu pertama berhasil dihapus!");
 }

 // 3. Tampilkan playlist dari awal ke akhir (maju)
 public void tampilMaju_3024() {
     if (head_3024 == null) {
         System.out.println("Playlist kosong.");
         return;
     }
     System.out.println("\n=== Daftar Lagu (dari awal ke akhir) ===");
     Lagu_2511533024 current = head_3024;
     int urutan = 1;
     while (current != null) {
         System.out.println(urutan + ". " + current.getJudul_3024() + " - " + current.getPenyanyi_3024());
         current = current.getNext_3024();
         urutan++;
     }
     System.out.println();
 }

 // 4. Tampilkan playlist dari akhir ke awal (mundur)
 public void tampilMundur_3024() {
     if (tail_3024 == null) {
         System.out.println("Playlist kosong.");
         return;
     }
     System.out.println("\n=== Daftar Lagu (dari akhir ke awal) ===");
     Lagu_2511533024 current = tail_3024;
     int urutan = 1;
     while (current != null) {
         System.out.println(urutan + ". " + current.getJudul_3024() + " - " + current.getPenyanyi_3024());
         current = current.getPrev_3024();
         urutan++;
     }
     System.out.println();
 }

 // 5. Cari lagu berdasarkan judul (tidak case-sensitive)
 public void cariLagu_3024(String judulCari) {
     if (head_3024 == null) {
         System.out.println("Playlist kosong, tidak dapat mencari.");
         return;
     }
     Lagu_2511533024 current = head_3024;
     boolean ditemukan = false;
     int urutan = 1;
     while (current != null) {
         if (current.getJudul_3024().equalsIgnoreCase(judulCari)) {
             System.out.println("Lagu ditemukan pada urutan ke-" + urutan);
             System.out.println("Judul: " + current.getJudul_3024() + " - Penyanyi: " + current.getPenyanyi_3024());
             ditemukan = true;
             break;
         }
         current = current.getNext_3024();
         urutan++;
     }
     if (!ditemukan) {
         System.out.println("Lagu dengan judul \"" + judulCari + "\" tidak ditemukan.");
     }
 }

 // ========== METHOD MAIN ==========
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Musik_2511533024 playlist = new Musik_2511533024();
     int pilihan;

     do {
         System.out.println("== Playlist Musik NIM: 2511533024 ==");
         System.out.println("1. Tambah Lagu");
         System.out.println("2. Hapus Lagu Pertama");
         System.out.println("3. Lihat Playlist (Maju)");
         System.out.println("4. Lihat Playlist (Mundur)");
         System.out.println("5. Cari Lagu");
         System.out.println("6. Keluar");
         System.out.print("Pilihan: ");
         pilihan = scanner.nextInt();
         scanner.nextLine();

         switch (pilihan) {
             case 1:
                 System.out.print("Judul: ");
                 String judul = scanner.nextLine();
                 System.out.print("Penyanyi: ");
                 String penyanyi = scanner.nextLine();
                 playlist.tambahLagu_3024(judul, penyanyi);
                 break;
             case 2:
                 playlist.hapusLaguAwal_3024();
                 break;
             case 3:
                 playlist.tampilMaju_3024();
                 break;
             case 4:
                 playlist.tampilMundur_3024();
                 break;
             case 5:
                 System.out.print("Masukkan judul lagu yang dicari: ");
                 String cari = scanner.nextLine();
                 playlist.cariLagu_3024(cari);
                 break;
             case 6:
                 System.out.println("Keluar dari program. Terima kasih!");
                 break;
             default:
                 System.out.println("Pilihan tidak valid. Silakan coba lagi.");
         }
         System.out.println();
     } while (pilihan != 6);

     scanner.close();
 }
}
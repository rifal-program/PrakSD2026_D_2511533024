package pekan2_2511533024;
import java.util.ArrayList;
import java.util.Scanner;

// ===== Kelas ADT Musik =====
class Musik_2511533024 {
    // Atribut dengan akhiran 4 digit NIM (3024)
    private String judul_3024;
    private String penyanyi_3024;
    private int durasi_3024;     // dalam detik

    // Constructor
    public Musik_2511533024(String judul, String penyanyi, int durasi) {
        this.judul_3024 = judul;
        this.penyanyi_3024 = penyanyi;
        this.durasi_3024 = durasi;
    }

    // Selektor (Getter)
    public String getJudul_3024() {
        return judul_3024;
    }

    public String getPenyanyi_3024() {
        return penyanyi_3024;
    }

    public int getDurasi_3024() {
        return durasi_3024;
    }

    // Mutator (Setter)
    public void setJudul_3024(String judul) {
        this.judul_3024 = judul;
    }

    public void setPenyanyi_3024(String penyanyi) {
        this.penyanyi_3024 = penyanyi;
    }

    public void setDurasi_3024(int durasi) {
        this.durasi_3024 = durasi;
    }
}

// ===== Kelas Driver (Playlist) =====
public class Playlist_2511533024 {
    public static void main(String[] args) {
        ArrayList<Musik_2511533024> playlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n== Playlist Musik NIM: 2511533024 ==");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1: // Tambah Lagu
                    System.out.print("Masukkan Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = scanner.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();
                    playlist.add(new Musik_2511533024(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2: // Lihat Playlist
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        System.out.println("\nDaftar Playlist:");
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511533024 lagu = playlist.get(i);
                            System.out.println((i + 1) + ". " + lagu.getJudul_3024() +
                                    " - " + lagu.getPenyanyi_3024() +
                                    " (" + lagu.getDurasi_3024() + " detik)");
                        }
                    }
                    break;

                case 3: // Hapus Lagu berdasarkan nomor indeks
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong, tidak ada yang dihapus.");
                    } else {
                        System.out.print("Masukkan nomor indeks lagu yang akan dihapus (1-" + playlist.size() + "): ");
                        int indeks = scanner.nextInt();
                        scanner.nextLine();
                        if (indeks >= 1 && indeks <= playlist.size()) {
                            playlist.remove(indeks - 1);
                            System.out.println("Lagu berhasil dihapus!");
                        } else {
                            System.out.println("Indeks tidak valid!");
                        }
                    }
                    break;

                case 4: // Cek Kapasitas (jumlah lagu)
                    System.out.println("Jumlah total lagu dalam playlist: " + playlist.size());
                    break;

                case 5: // Keluar
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
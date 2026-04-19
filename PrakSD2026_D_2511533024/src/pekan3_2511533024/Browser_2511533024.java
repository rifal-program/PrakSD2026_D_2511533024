package pekan3_2511533024;
import java.util.Scanner;
import java.util.Stack;

// ===== Kelas ADT Website =====
class Website_2511533024 {
    // Atribut dengan akhiran 4 digit NIM (3024)
    private String judul_3024;
    private String url_3024;

    // Constructor
    public Website_2511533024(String judul, String url) {
        this.judul_3024 = judul;
        this.url_3024 = url;
    }

    // Selektor (Getter)
    public String getJudul_3024() {
        return judul_3024;
    }

    public String getUrl_3024() {
        return url_3024;
    }

    // Mutator (Setter)
    public void setJudul_3024(String judul) {
        this.judul_3024 = judul;
    }

    public void setUrl_3024(String url) {
        this.url_3024 = url;
    }
}

// ===== Kelas Driver (Browser) =====
public class Browser_2511533024 {
    public static void main(String[] args) {
        Stack<Website_2511533024> history = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n== Browser History NIM: 2511533024 ==");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihkan newline

            switch (pilihan) {
                case 1: // Push - Kunjungi website
                    System.out.print("Masukkan Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = scanner.nextLine();
                    history.push(new Website_2511533024(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2: // Pop - Tombol Back
                    if (history.isEmpty()) {
                        System.out.println("Riwayat kosong. Tidak ada halaman yang bisa di-back.");
                    } else {
                        Website_2511533024 halamanDihapus = history.pop();
                        System.out.println("Kembali dari halaman: " + halamanDihapus.getJudul_3024()
                                + " (" + halamanDihapus.getUrl_3024() + ")");
                    }
                    break;

                case 3: // Peek - Lihat halaman aktif (tanpa menghapus)
                    if (history.isEmpty()) {
                        System.out.println("Tidak ada halaman aktif. History kosong.");
                    } else {
                        Website_2511533024 halamanAktif = history.peek();
                        System.out.println("Halaman aktif saat ini:");
                        System.out.println("Judul: " + halamanAktif.getJudul_3024());
                        System.out.println("URL  : " + halamanAktif.getUrl_3024());
                    }
                    break;

                case 4: // Cek status history (size & isEmpty)
                    System.out.println("Jumlah total riwayat: " + history.size());
                    if (history.isEmpty()) {
                        System.out.println("Status: History kosong.");
                    } else {
                        System.out.println("Status: History tidak kosong.");
                    }
                    break;

                case 5: // Keluar
                    System.out.println("Keluar dari program browser history. Selamat browsing!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
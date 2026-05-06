package pekan5_2511533024;

import java.util.Scanner;

public class RumahSakit_2511533024 {

    static Pasien_2511533024 head_3024 = null;
    static int counterAntrian_3024 = 0;

    // Insert at Tail (Daftarkan Pasien)
    public static void daftarkanPasien_3024(String nama_3024, String keluhan_3024) {
        counterAntrian_3024++;
        Pasien_2511533024 pasienBaru_3024 = new Pasien_2511533024(nama_3024, keluhan_3024, counterAntrian_3024);

        if (head_3024 == null) {
            head_3024 = pasienBaru_3024;
        } else {
            Pasien_2511533024 temp_3024 = head_3024;
            while (temp_3024.next_3024 != null) {
                temp_3024 = temp_3024.next_3024;
            }
            temp_3024.next_3024 = pasienBaru_3024;
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counterAntrian_3024);
    }

    // Delete Head (Panggil Pasien)
    public static void panggilPasien_3024() {
        if (head_3024 == null) {
            System.out.println("Antrian kosong! Tidak ada pasien yang bisa dipanggil.");
            return;
        }

        System.out.println("Pasien Dipanggil:");
        System.out.println("Nomor Antrian : " + head_3024.getNomorAntrian_3024());
        System.out.println("Nama Pasien   : " + head_3024.getNamaPasien_3024());
        System.out.println("Keluhan       : " + head_3024.getKeluhan_3024());

        head_3024 = head_3024.next_3024;
        System.out.println("Pasien telah selesai dipanggil dan dihapus dari antrian.");
    }

    // Display (Tampilkan Antrian)
    public static void tampilkanAntrian_3024() {
        if (head_3024 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511533024 temp_3024 = head_3024;
        int posisi_3024 = 1;

        System.out.println("===== DAFTAR ANTRIAN PASIEN =====");

        while (temp_3024 != null) {
            System.out.println("Posisi Antrian : " + posisi_3024);
            System.out.println("Nomor Antrian  : " + temp_3024.getNomorAntrian_3024());
            System.out.println("Nama Pasien    : " + temp_3024.getNamaPasien_3024());
            System.out.println("Keluhan        : " + temp_3024.getKeluhan_3024());
            System.out.println("--------------------------------");
            temp_3024 = temp_3024.next_3024;
            posisi_3024++;
        }
    }

    // Search Case-Insensitive (Cari Pasien)
    public static void cariPasien_3024(String namaCari_3024) {
        if (head_3024 == null) {
            System.out.println("Antrian kosong, tidak ada pasien untuk dicari.");
            return;
        }

        Pasien_2511533024 temp_3024 = head_3024;
        boolean ketemu_3024 = false;

        while (temp_3024 != null) {
            if (temp_3024.getNamaPasien_3024().equalsIgnoreCase(namaCari_3024)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("Nomor Antrian : " + temp_3024.getNomorAntrian_3024());
                System.out.println("Nama Pasien   : " + temp_3024.getNamaPasien_3024());
                System.out.println("Keluhan       : " + temp_3024.getKeluhan_3024());
                ketemu_3024 = true;
                break;
            }
            temp_3024 = temp_3024.next_3024;
        }

        if (!ketemu_3024) {
            System.out.println("Pasien dengan nama \"" + namaCari_3024 + "\" tidak ditemukan dalam antrian.");
        }
    }

    // Cek Status Antrian
    public static void cekStatusAntrian_3024() {
        if (head_3024 == null) {
            System.out.println("Antrian kosong. Tidak ada pasien terdaftar.");
            return;
        }

        int jumlah_3024 = 0;
        Pasien_2511533024 temp_3024 = head_3024;

        while (temp_3024 != null) {
            jumlah_3024++;
            temp_3024 = temp_3024.next_3024;
        }

        System.out.println("===== STATUS ANTRIAN =====");
        System.out.println("Total pasien dalam antrian: " + jumlah_3024);
        System.out.println("Pasien terdepan:");
        System.out.println("Nomor Antrian : " + head_3024.getNomorAntrian_3024());
        System.out.println("Nama Pasien   : " + head_3024.getNamaPasien_3024());
        System.out.println("Keluhan       : " + head_3024.getKeluhan_3024());
    }

    // MAIN PROGRAM
    public static void main(String[] args) {

        Scanner input_3024 = new Scanner(System.in);
        int pilihan_3024;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533024 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien   (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien      (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3024 = input_3024.nextInt();
            input_3024.nextLine();

            switch (pilihan_3024) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3024 = input_3024.nextLine();

                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_3024 = input_3024.nextLine();

                    daftarkanPasien_3024(nama_3024, keluhan_3024);
                    break;

                case 2:
                    panggilPasien_3024();
                    break;

                case 3:
                    tampilkanAntrian_3024();
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_3024 = input_3024.nextLine();
                    cariPasien_3024(cari_3024);
                    break;

                case 5:
                    cekStatusAntrian_3024();
                    break;

                case 6:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-6.");
            }

        } while (pilihan_3024 != 6);

        input_3024.close();
    }
}
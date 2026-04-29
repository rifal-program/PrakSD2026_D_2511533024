package pekan4_2511533024;

import java.util.Scanner;

public class AntrianLoket_2511533024 {
    // Variabel dengan akhiran 4 digit NIM (_3024)
    private int front_3024;        // indeks depan antrian
    private int rear_3024;         // indeks belakang antrian
    private int max_3024;          // kapasitas maksimal array
    private int count_3024;        // jumlah elemen saat ini (membantu operasi)
    private String[] queue_3024;   // array penyimpan data pelanggan

    // Konstruktor
    public AntrianLoket_2511533024(int kapasitas) {
        this.max_3024 = kapasitas;
        queue_3024 = new String[kapasitas];
        front_3024 = 0;
        rear_3024 = -1;
        count_3024 = 0;
    }

    // Method mengecek apakah antrian kosong
    public boolean isEmpty() {
        return count_3024 == 0;
    }

    // Method mengecek apakah antrian penuh
    public boolean isFull() {
        return count_3024 == max_3024;
    }

    // Method menambahkan pelanggan ke antrian (enqueue)
    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambah pelanggan.");
            return;
        }
        rear_3024 = (rear_3024 + 1) % max_3024;
        queue_3024[rear_3024] = data;
        count_3024++;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    // Method menghapus pelanggan dari antrian (dequeue)
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada pelanggan untuk dilayani.");
            return null;
        }
        String removed = queue_3024[front_3024];
        queue_3024[front_3024] = null;
        front_3024 = (front_3024 + 1) % max_3024;
        count_3024--;
        if (isEmpty()) {
            // Reset posisi agar konsisten saat antrian kosong
            front_3024 = 0;
            rear_3024 = -1;
        }
        return removed;
    }

    // Method menampilkan seluruh isi antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.print("Isi antrian: ");
        int idx = front_3024;
        for (int i = 0; i < count_3024; i++) {
            System.out.print((i + 1) + ". " + queue_3024[idx]);
            if (i < count_3024 - 1) {
                System.out.print(" ");
            }
            idx = (idx + 1) % max_3024;
        }
        System.out.println();
    }

    // Method membalik seluruh isi antrian (Reverse)
    public void Reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat melakukan reverse.");
            return;
        }
        int size = count_3024;
        String[] temp = new String[size];
        int idx = front_3024;
        // Salin elemen dari antrian ke array temporer (urutan asli)
        for (int i = 0; i < size; i++) {
            temp[i] = queue_3024[idx];
            idx = (idx + 1) % max_3024;
        }
        // Salin kembali ke antrian dalam urutan terbalik
        idx = front_3024;
        for (int i = size - 1; i >= 0; i--) {
            queue_3024[idx] = temp[i];
            idx = (idx + 1) % max_3024;
        }
        // Update rear_3024 agar sesuai dengan posisi terakhir setelah reverse
        rear_3024 = (front_3024 + size - 1) % max_3024;
        // Tampilkan antrian setelah dibalik (sesuai contoh output)
        display();
    }

    // Method main (menu interaktif)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLoket_2511533024 antrian = new AntrianLoket_2511533024(5); // kapasitas 5
        int pilihan;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            while (!input.hasNextInt()) {
                System.out.print("Masukkan angka menu (1-5): ");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.enqueue(nama);
                    break;
                case 2:
                    String dilayani = antrian.dequeue();
                    if (dilayani != null) {
                        System.out.println(dilayani + " telah dilayani");
                    }
                    break;
                case 3:
                    antrian.display();
                    break;
                case 4:
                    antrian.Reverse();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        input.close();
    }
}

package pekan6_2511533024;
//Kelas Lagu dengan NIM lengkap 2511533024
public class Lagu_2511533024 {
 // Atribut dengan akhiran 3024
 private String judul_3024;
 private String penyanyi_3024;
 private Lagu_2511533024 next_3024;
 private Lagu_2511533024 prev_3024;

 // Constructor
 public Lagu_2511533024(String judul_3024, String penyanyi_3024) {
     this.judul_3024 = judul_3024;
     this.penyanyi_3024 = penyanyi_3024;
     this.next_3024 = null;
     this.prev_3024 = null;
 }

 // Getter dan Setter
 public String getJudul_3024() {
     return judul_3024;
 }

 public void setJudul_3024(String judul_3024) {
     this.judul_3024 = judul_3024;
 }

 public String getPenyanyi_3024() {
     return penyanyi_3024;
 }

 public void setPenyanyi_3024(String penyanyi_3024) {
     this.penyanyi_3024 = penyanyi_3024;
 }

 public Lagu_2511533024 getNext_3024() {
     return next_3024;
 }

 public void setNext_3024(Lagu_2511533024 next_3024) {
     this.next_3024 = next_3024;
 }

 public Lagu_2511533024 getPrev_3024() {
     return prev_3024;
 }

 public void setPrev_3024(Lagu_2511533024 prev_3024) {
     this.prev_3024 = prev_3024;
 }
}
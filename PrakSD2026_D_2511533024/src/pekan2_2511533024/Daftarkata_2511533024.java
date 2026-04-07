package pekan2_2511533024;
import java.util.ArrayList;

public class Daftarkata_2511533024 {
	private final ArrayList<String> data;
	public Daftarkata_2511533024 () {
		this.data = new ArrayList<>();
	}
	public void tambah (String elemen) {
		data.add(elemen);
	}
	public void tambahpada(int index,String elemen) {
		data.add(index, elemen);
	}
	public void ubahElemen(int index,String nilaibaru) {
		data.set(index, nilaibaru);	
	}
	
	public String hapusElemen(int index) {
		return data.remove(index);
	}
public void iterasicetak() {
	for (int i = 0; i < data.size(); i++) {
		System.out.print(data.get(i)+ " ");
	}
}
public String get (int index) {
	return data.get(index);
			}
public String toString () {
	return data.toString();
}
}

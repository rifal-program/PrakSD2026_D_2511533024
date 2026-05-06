package pekan5_2511533024;

public class Pasien_2511533024 {
	
	    private String namaPasien_3024;
	    private String keluhan_3024;
	    private int nomorAntrian_3024;

	    Pasien_2511533024 next_3024;

	    // Constructor
	    public Pasien_2511533024(String namaPasien_3024, String keluhan_3024, int nomorAntrian_3024) {
	        this.namaPasien_3024 = namaPasien_3024;
	        this.keluhan_3024 = keluhan_3024;
	        this.nomorAntrian_3024 = nomorAntrian_3024;
	        this.next_3024 = null;
	    }

	    // Getter
	    public String getNamaPasien_3024() {
	        return namaPasien_3024;
	    }

	    public String getKeluhan_3024() {
	        return keluhan_3024;
	    }

	    public int getNomorAntrian_3024() {
	        return nomorAntrian_3024;
	    }

	    public Pasien_2511533024 getNext_3024() {
	        return next_3024;
	    }

	    // Setter
	    public void setNamaPasien_3024(String namaPasien_3024) {
	        this.namaPasien_3024 = namaPasien_3024;
	    }

	    public void setKeluhan_3024(String keluhan_3024) {
	        this.keluhan_3024 = keluhan_3024;
	    }

	    public void setNomorAntrian_3024(int nomorAntrian_3024) {
	        this.nomorAntrian_3024 = nomorAntrian_3024;
	    }

	    public void setNext_3024(Pasien_2511533024 next_3024) {
	        this.next_3024 = next_3024;
	    }
	}


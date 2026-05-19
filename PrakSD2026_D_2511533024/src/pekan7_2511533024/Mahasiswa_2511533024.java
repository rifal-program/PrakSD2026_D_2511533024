package pekan7_2511533024;

public class Mahasiswa_2511533024 {
    private String name_3024;
    private String nim_3024;
    private String prodi_3024;

    public Mahasiswa_2511533024(String name_3024, String nim_3024, String prodi_3024) {
        this.name_3024 = name_3024;
        this.nim_3024 = nim_3024;
        this.prodi_3024 = prodi_3024;
    }

    public String getName_3024() {
        return name_3024;
    }

    public void setName_3024(String name_3024) {
        this.name_3024 = name_3024;
    }

    public String getNim_3024() {
        return nim_3024;
    }

    public void setNim_3024(String nim_3024) {
        this.nim_3024 = nim_3024;
    }

    public String getProdi_3024() {
        return prodi_3024;
    }

    public void setProdi_3024(String prodi_3024) {
        this.prodi_3024 = prodi_3024;
    }

    @Override
    public String toString() {
        return name_3024 + "(" + nim_3024 + ")";
    }
}
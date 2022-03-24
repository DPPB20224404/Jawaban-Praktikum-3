import java.util.ArrayList;

public class Departemen {
    private String namaDepartemen;
    private ArrayList<Pegawai> daftarPegawai;

    public void setDaftarPegawai(ArrayList daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }

    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }

    public ArrayList<Pegawai> getDaftarPegawai() {
        return daftarPegawai;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }
}
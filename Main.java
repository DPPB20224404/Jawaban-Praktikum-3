import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    Departemen finance = new Departemen();
    finance.setNamaDepartemen("Keuangan");
    ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
    
    Manajer adam = new Manajer(true);
    adam.setGaji(700000);
    adam.setNamaPegawai("Adam");
    adam.setNipPegawai(1234);

    Staff betty = new Staff(true);
    betty.setNamaPegawai("Betty");
    betty.setNipPegawai(1122);
    betty.setGaji(50000);

    Staff charlie = new Staff(false);
    charlie.setNamaPegawai("Charlie");
    charlie.setNipPegawai(4432);
    charlie.setGaji(50000);

    daftarPegawai.add(adam);
    daftarPegawai.add(betty);
    daftarPegawai.add(charlie);

    finance.setDaftarPegawai(daftarPegawai);

    for (Pegawai pegawai: finance.getDaftarPegawai()) {
      pegawai.kerja();
      System.out.println("Gaji yang didapat untuk " + pegawai.getNamaPegawai() + " adalah "+ pegawai.getGaji());
    }

    for (Pegawai pegawai: finance.getDaftarPegawai()) {
      pegawai.kerja();
      System.out.println("Gaji yang didapat untuk " + pegawai.getNamaPegawai() + " dengan lembur 4 jam adalah "+ pegawai.getGaji(4));
    }
  }
}
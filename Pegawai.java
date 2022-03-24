class Pegawai{
  private String namaPegawai;
  protected String posisi;
  private int nipPegawai;
  private double gaji;
  protected int jumlahJamKerja;
  protected Boolean pegawaiTetap;

  public Pegawai(Boolean pegawaiTetap){
    this.pegawaiTetap = pegawaiTetap;
  }

  public void setGaji(double gaji) {
    this.gaji = gaji;
  }

  public void setNamaPegawai(String namaPegawai) {
    this.namaPegawai = namaPegawai;
  }

  public void setNipPegawai(int nipPegawai)    {
    this.nipPegawai = nipPegawai;
  }

  public double getGaji() {
    return gaji * jumlahJamKerja * 4;
  }

  public double getGaji(int jamLembur) {
    return gaji;
  }

  public int getNipPegawai() {
    return nipPegawai;
  }

  public String getNamaPegawai() {
    return namaPegawai;
  }

  public void kerja(){
      System.out.println("Bekerja selama " + this.jumlahJamKerja);
  }
}
public class Staff extends Pegawai{

  public Staff(boolean pegawaiTetap){
    super(pegawaiTetap);
  }

  @Override
  public void kerja(){
    this.posisi     = "Staff";
    jumlahJamKerja  = 40;
    System.out.println("Jumlah jam kerja "+ posisi +" per minggu " + jumlahJamKerja);
  }

  @Override
  public double getGaji(){
    if(this.pegawaiTetap)
        return super.getGaji() - (super.getGaji() * 0.05);
    else
        return super.getGaji() - (super.getGaji() * 0.025);
  }

  @Override
  public double getGaji(int jamLembur){
    if(this.pegawaiTetap)
      return this.getGaji() + (jamLembur * 25000);
    else
      return this.getGaji() + (jamLembur * 15000);
  }
}
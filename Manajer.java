class Manajer extends Pegawai{

  private double tunjanganJabatan = 1000000.00;

  public Manajer(boolean pegawaiTetap){
    super(pegawaiTetap);
  }
  
  @Override
  public void kerja(){
    this.posisi     = "Manajer";
    jumlahJamKerja  = 50;
    System.out.println("Jumlah jam kerja " + posisi + " per minggu " + jumlahJamKerja);
  }

  @Override
  public double getGaji(){
    return (super.getGaji() + tunjanganJabatan) - ((super.getGaji() + tunjanganJabatan) * 0.075) ;
  }

  @Override
  public double getGaji(int jamLembur){
    return this.getGaji() + (jamLembur * 35000);
  }
}

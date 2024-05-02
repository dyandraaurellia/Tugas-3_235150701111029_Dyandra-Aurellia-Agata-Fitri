public class PegawaiTetap extends Pegawai {
    private double upah;
    
    
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    
    public double getUpah() {
        return upah;
    }

    public void setUpah (double upah) {
            this.upah=upah;
        }
    
    public int pendapatan () {
        return (int)getUpah();
    }
    
    @Override
    public String toString() {
        System.out.println("================PEGAWAI TETAP===============");
        return "Nama Pegawai Tetap\t: " + getNama() 
                + "\nNo.Ktp\t\t\t: " + getNoKTP() 
                + "\nUpah\t\t\t: "+upah 
                + "\nTotal Pendapatan\t: Rp " + pendapatan() 
                + "\n";
    }
}

public class Sales extends Pegawai  {
    private double komisi;
    private int penjualan;
    
    public Sales(String nama, String noKTP,int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }
    
    public int getPenjualan() {
        return penjualan;
    }
    
    public double getKomisi() {
        return komisi;
    }
    
    public void setPenjualan (int penjualan ) { 
        this.penjualan = penjualan;
    }
    
    public void setKomisi (double komisi ) {
        this.komisi = komisi;
    }

    public int pendapatan() {
        return (int)(penjualan * komisi);
    }
    
    @Override
    public String toString() {
        System.out.println("===================SALES====================");
        return "Nama Sales\t\t: "+ getNama()
                + "\nNo KTP\t\t\t: " + getNoKTP() 
                + "\nPenjualan\t\t: " + penjualan +" unit" 
                + "\nKomisi\t\t\t: " + komisi + "\nPendapatan\t\t: Rp " + pendapatan() 
                + "\n";
    }
}


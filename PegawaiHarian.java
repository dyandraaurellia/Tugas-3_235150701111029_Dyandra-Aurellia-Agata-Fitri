public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;
    
    public PegawaiHarian (String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }
        
    public double getUpahPerJam() {
        return upahPerJam;
    }
    
    public void setUpahPerJam (double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    
    public int getTotalJam() {
        return totalJam;
    }
    
    public void setTotalJam (int totalJam) {
        this.totalJam = totalJam;
    }
    
    public int pendapatan(){
        if (totalJam <= 40){
            return (int) upahPerJam * totalJam;
        }else {
            return (int)((totalJam * upahPerJam) + ((totalJam - 40) * upahPerJam * 1.5));
        }
    }

    @Override
    public String toString() {
        System.out.println("===============PEGAWAI HARIAN===============");
        return "Nama Pegawai Harian\t: " + getNama()
                + "\nNo.KTP\t\t\t: " + getNoKTP()
                + "\nUpah/Jam\t\t: " + "Rp " +upahPerJam +"/jam" 
                + "\nTotal Jam Kerja\t\t: " + totalJam + " jam"
                + "\nPendapatan\t\t: Rp " + pendapatan() 
                + "\n";
    }
}
    

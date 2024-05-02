import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pegawai> pegawai = new ArrayList<>();
        System.out.println(" ");

        //Pegawai Tetap
        pegawai.add(new PegawaiTetap("Agung", "3374858773928811", 3200000));
        pegawai.add(new PegawaiTetap("Zidane", "30017467956475609", 3600000));
        pegawai.add(new PegawaiTetap("Nadila", "37617493886448029", 4300000));

        //Pegawai Harian
        pegawai.add(new PegawaiHarian("Rizqi", "3152033876451028", 6500, 35));
        pegawai.add(new PegawaiHarian("Andreas", "302018752938450", 8500, 45));
        pegawai.add(new PegawaiHarian("Tony", "3152839157045187", 7500, 40));

        //Sales
        pegawai.add(new Sales("Salma", "3306638565487121", 70, 85000));
        pegawai.add(new Sales("Lidya", "311398451837800", 75, 77000));
        pegawai.add(new Sales("Nada", "311385751598471", 80, 65000));

        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}
package praktikum_5;
public class Mobil extends Kendaraan{
    private int kapasitas;
    private boolean sopir;
    
    public Mobil(String merk, String plat, double hargaSewaPerHari, int kapasitas, boolean sopir) {
        super(merk, plat, hargaSewaPerHari);
        this.kapasitas = kapasitas;
        this.sopir = sopir;
    }
    
    @Override
    public double hitungBiaya(int lamaSewa) {
        double biaya = super.hitungBiaya(lamaSewa);
        if(sopir) biaya += 150000 * lamaSewa;
        return biaya;
    }
    
    public String tampilInfo() {
        return super.tampiInfo() +
                "\nJenis Mobil" +
                "\nKapasitas :" + kapasitas + "orang" +
                "\nSopir : " + (sopir ? "Ya" : "Tidak");
    }
}

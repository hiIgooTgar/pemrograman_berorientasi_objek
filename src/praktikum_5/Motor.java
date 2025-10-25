package praktikum_5;
public class Motor extends Kendaraan {
    private String tipe;
    
    public Motor(String merk, String plat, double hargaSewaPerHari, String tipe) {
        super(merk, plat, hargaSewaPerHari);
        this.tipe = tipe;
    }
    
    @Override
    public double hitungBiaya(int lamaSewa) {
        double biaya = super.hitungBiaya(lamaSewa);
        if (tipe.equalsIgnoreCase("Sport")) biaya += 50000 * lamaSewa;
        return biaya;
    }
    
    public String tampilInfo() {
        return super.tampiInfo() +
                "\nJensi : Motor" +
                "\nTipe : " + tipe;
    }
}

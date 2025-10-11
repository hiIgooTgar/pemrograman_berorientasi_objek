package praktikum_3;

public class Mobil {

    private String warna;
    private String merk;

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
        System.out.println("Objek Mobil dibuat di heap memory.");
    }

    public void nyalakan() {
        System.out.println("Mobil" + merk + " berwarna " + warna + " dinyalakan.");
    }
    
    @Override
    protected void finalize() {
        System.out.println("Objek Mobil dihapus oleh Garbage Collector.");
    }
}

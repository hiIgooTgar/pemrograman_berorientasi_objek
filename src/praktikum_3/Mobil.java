package praktikum_3;

public class Mobil {

    private String warna;
    private String merk;
    private static int jumlahHeapMobil = 0;

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
        System.out.println("Objek Mobil dibuat di heap memory.");
        jumlahHeapMobil++;
    }

    public void nyalakan() {
        System.out.println("Mobil" + merk + " berwarna " + warna + " dinyalakan.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objek Mobil dihapus oleh Garbage Collector.");
        super.finalize();
    }
    
    public static void decrementMobil() {
        if (jumlahHeapMobil > 0) {
            jumlahHeapMobil--;
        }
    }

    public static int getJumlahHeapMobil() {
        return jumlahHeapMobil;
    }
}

package praktikum_3;

public class Motor {

    private String warna;
    private String merk;

    public Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
        System.out.println("Objek Motor dibuat di heap memory.");
    }

    public void nyalakan() {
        System.out.println("Motor " + merk + " berwarna " + warna + " dinyalakan.");
    }

    @Override
    protected void finalize() {
        System.out.println("Objek Motor dihapus oleh Garbage Collector.");
    }
}

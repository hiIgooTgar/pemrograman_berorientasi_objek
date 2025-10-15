package praktikum_3;

public class Motor {

    private String warna;
    private String merk;
    private static int jumlahHeapMotor = 0;

    public Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
        System.out.println("Objek Motor dibuat di heap memory.");
        jumlahHeapMotor++;
    }

    public void nyalakan() {
        System.out.println("Motor " + merk + " berwarna " + warna + " dinyalakan.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objek Motor dihapus oleh Garbage Collector.");
        super.finalize();
    }
    
    public static void decrementMotor() {
        if (jumlahHeapMotor > 0) {
            jumlahHeapMotor--;
        }
    }

     public static int getJumlahHeapMotor() {
        return jumlahHeapMotor;
    }
}
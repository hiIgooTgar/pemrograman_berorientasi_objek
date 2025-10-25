package praktikum_5;

public class Kendaraan {

    protected String merk;
    protected String plat;
    protected double hargaSewaPerHari;

    public Kendaraan(String merk, String plat, double hargaSewaPerHari) {
        this.merk = merk;
        this.plat = plat;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public String tampiInfo() {
        return "Merk : " + merk + "\nPlat Nomor : " + plat + "\nHarga Sewa/Hari: Rp " + hargaSewaPerHari;
    }

    public double hitungBiaya(int lamaSewa) {
        return hargaSewaPerHari * lamaSewa;
    }

    public double hitungBiaya(int lamaSewa, double diskon) {
        return (hargaSewaPerHari * lamaSewa) - diskon;
    }
}

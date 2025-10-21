package praktikum_4;

public class Pegawai {
    public String namaPublic;
    private double gajiPrivate;
    protected String jabatanProtected;

    public Pegawai() {
        namaPublic = "Belum diatur";
        gajiPrivate = 0;
        jabatanProtected = "Staff";
    }

    public void setGajiPrivate(double gaji) {
        if (gaji >= 0) {
            this.gajiPrivate = gaji;
        }
    }

    public double getGajiPrivate() {
        return gajiPrivate;
    }

    public String getInfo() {
        return "Nama : " + namaPublic +
                "\nJabatan : " + jabatanProtected +
                "\nGaji (akses private via getter) : Rp " + String.format("%.0f", gajiPrivate);
    }
}

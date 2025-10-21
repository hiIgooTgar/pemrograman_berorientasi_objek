package praktikum_4;

public class Staff extends Pegawai {
    public Staff() {
        namaPublic = "Edward Xanders";
        jabatanProtected = "Karyawan";
        setGajiPrivate(800000);
    }

    @Override
    public String getInfo() {
        return "Nama : " + namaPublic +
                "\nJabatan : " + jabatanProtected +
                "\nGaji (akses private via getter) : Rp " + String.format("%.0f", getGajiPrivate());
    }
}
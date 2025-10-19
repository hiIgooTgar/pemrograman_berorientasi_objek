package praktikum_4;

public class Manajer extends Pegawai {
   public Manajer() {
       namaPublic = "Igo Tegar Prambudhy";
       jabatanProtected = "Manajer Keuangan";
       setGajiPrivate(15000000);
   }
   
   public String getInfo() {
        return "Nama : " + namaPublic +
                "\nJabatan : " + jabatanProtected +
                "\nGaji (akses private via getter) : Rp " + getGajiPrivate();
   }
   
   
}

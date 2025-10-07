package praktikum_2;

public class mahasiswa_2 {

    public static void main(String[] args) {
        mahasiswa_1 mhs1 = new mahasiswa_1("Igo Tegar Prambudhy", "24SA11A159");
        mhs1.setNama("Edward Xaverius");
        System.out.println("Nama baru mahasiswa : " + mhs1.getNama());
        mhs1 = null;
        System.gc();
        System.out.println("Program selesai");
    }
}

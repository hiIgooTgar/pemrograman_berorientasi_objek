package uts_pbo;

class Mahasiswa {
    private String nama;
    private String nim;
    
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
}
public class p_3 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Igo", "24SA11A159");
        System.out.println(mhs);
        mhs.setNama("Tegar");
        System.out.println(mhs.getNama());
    }
    
}

package model;

public class mahasiswa {
    private String nim, nama, prodi, no_telp, alamat;
    
    public mahasiswa(String nim, String nama, String prodi, String no_telp, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.no_telp = no_telp;
        this.alamat = alamat;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getProdi() {
        return prodi;
    }
    
    public String getNoTelp() {
        return no_telp;
    }
    
     public String getAlamat() {
        return alamat;
    }
}

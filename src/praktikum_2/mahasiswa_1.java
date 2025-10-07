package praktikum_2;

public class mahasiswa_1 {
    private String nama;
    private String nim;
    
    public mahasiswa_1(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        System.out.println("Objeck mahasiswa dibuat!");
        System.out.println("Nama : " + this.nama + ", NIM : " + this.nim);
    }
     
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String nim() {
        return nim;
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objek mahasiswa dengan nama " + this.nama + " dihancurkan");
    }
}

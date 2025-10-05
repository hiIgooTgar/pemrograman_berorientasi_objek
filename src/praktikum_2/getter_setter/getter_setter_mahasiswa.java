package praktikum_2.getter_setter;

public class getter_setter_mahasiswa {
    private String nama;
    private String nim;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public static void main(String[] args) {
        getter_setter_mahasiswa mhs = new getter_setter_mahasiswa();
        mhs.setNama("Igo Tegar Prambudhy");
        mhs.setNim("24SA11A159");
        
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NIM : " + mhs.getNim());
    }
}
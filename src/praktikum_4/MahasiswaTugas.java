package praktikum_4;

public class MahasiswaTugas {

    private String nama;
    private String nim;
    private String jurusan;
    private String jenis_kelamin;
    private String dosen_pembimbing;
    private String alamat;

    public MahasiswaTugas() {}

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public void setDosenPembimbing(String dosen_pembimbing) {
        this.dosen_pembimbing = dosen_pembimbing;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public String getJenisKelamin() {
        return jenis_kelamin;
    }
    
    public String getDosenPembimbing() {
        return dosen_pembimbing;
    }
    
    public String getAlamat() {
        return alamat;
    }
}

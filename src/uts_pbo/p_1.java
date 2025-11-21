package uts_pbo;

class Mobil {
    String merk;
    String warna;
    int tahun;
    
    void berjalan() {
        System.out.println("Mobil Berjalan");
    }
    
    void berhenti() {
        System.out.println("Mobil berhenti");
    }
}

public class p_1 {
    public static void main(String[] args) {
        Mobil car = new Mobil();
        car.berjalan();
        car.berhenti();
    }
    
}

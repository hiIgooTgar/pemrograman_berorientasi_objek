package praktikum_2.inheritance;

class Manusia {
    String nama;
    void perkenalan() {
        System.out.println("Hallo, nama saya " + nama);
    }
}

class Mahasiswa extends Manusia {
    String nim;
    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
    }
}

public class inheritance_mahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Igo Tegar Prambudhy";
        mhs.nim = "24SA11A159";
        mhs.perkenalan();
        mhs.tampilkanData();
    }
}

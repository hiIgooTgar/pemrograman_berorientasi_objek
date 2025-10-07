package praktikum_2;

abstract class Kendaraan {
    abstract void bergerak();
}

class Mobil extends Kendaraan {
    void bergerak() {
        System.out.println("Mobil berjalan dengan roda");
    }
}

class Pesawat extends Kendaraan {
    void bergerak() {
        System.out.println("Pesawat terbang di udara");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Kendaraan kendaran1 = new Mobil();
        Kendaraan kendaran2 = new Pesawat();
        kendaran1.bergerak();
        kendaran2.bergerak();
    }
}
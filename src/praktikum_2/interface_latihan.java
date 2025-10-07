package praktikum_2;
interface Kendaraan_interface {
    void bergerak();
}

class Sepeda implements Kendaraan_interface {
    public void bergerak() {
        System.out.println("Sependa dikayuh");
    }
}

class Motor implements Kendaraan_interface {
    public void bergerak() {
        System.out.println("Motor berjalan dengan mesin");
    }
}

public class interface_latihan {
    public static void main(String[] args) {
        Kendaraan_interface kendaraan1 = new Sepeda();
        Kendaraan_interface kendaraan2 = new Motor();
        kendaraan1.bergerak();
        kendaraan2.bergerak();
    }
}

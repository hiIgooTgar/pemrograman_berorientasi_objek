package praktikum_2.interface_java;
interface Kendaraan {
    void bergerak();
}

class Sepeda implements Kendaraan {
    public void bergerak() {
        System.out.println("Sependa dikayuh");
    }
}

class Motor implements Kendaraan {
    public void bergerak() {
        System.out.println("Motor berjalan dengan mesin");
    }
}

public class interface_latihan {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Sepeda();
        Kendaraan kendaraan2 = new Motor();
        kendaraan1.bergerak();
        kendaraan2.bergerak();
    }
}

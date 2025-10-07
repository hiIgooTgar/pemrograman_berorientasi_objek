package praktikum_2;

class Hewan {
    void suara() {
        System.out.println("Suara bersuara!");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meongg..");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk-gukk...");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        
        hewan1.suara();
        hewan2.suara();
    }
}

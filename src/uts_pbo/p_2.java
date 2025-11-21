package uts_pbo;

class hewan {
    void bernafas() {
        System.out.println("Hewan sedang bernafas");
    }
}

class kucing extends hewan {
    void bersuara() {
        System.out.println("Meong");
    }
}

class anjing extends hewan {
    void bersuara() {
        System.out.println("Mengonggong");
    }
}

public class p_2 {
    public static void main(String[] args) {
        kucing h1 = new kucing();
        anjing h2 = new anjing();
        h1.bersuara();
        h1.bernafas();
        System.out.println("");
        h2.bersuara();
        h2.bernafas();
    }
}

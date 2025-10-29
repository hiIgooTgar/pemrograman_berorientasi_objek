package praktikum_6;

public class Kubus extends bangunRuang {

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

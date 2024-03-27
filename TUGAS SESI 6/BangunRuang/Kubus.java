package BangunRuang;
import BangunDatar.Persegi;

public class Kubus extends Persegi implements Geometri {
    private double tinggi;

    public Kubus(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    @Override
    public double calculateVolume() {
        return calculateArea() * tinggi;
    }

    @Override
    public double calculateLuasPermukaan() {
        return 6 * calculateArea();
    }
}
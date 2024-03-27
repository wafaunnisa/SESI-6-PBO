package BangunRuang;

public class Tabung implements Geometri {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double calculateLuasPermukaan() {
        return (2 * Math.PI * jariJari * tinggi) + (2 * Math.PI * Math.pow(jariJari, 2));
    }
}
package BangunRuang;

public class Bola implements Geometri {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double calculateLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}
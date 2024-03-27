package BangunDatar;

public class Lingkaran implements Shape {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double calculateArea() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * jariJari;
    }
}

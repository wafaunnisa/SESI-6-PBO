package BangunDatar;

public class Persegi implements Shape {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double calculateArea() {
        return sisi * sisi;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sisi;
    }
}
package BangunDatar;

public class PersegiPanjang implements Shape {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double calculateArea() {
        return panjang * lebar;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (panjang + lebar);
    }
}
package BangunDatar;

public abstract class Segitiga implements Shape {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Abstract methods
    public abstract double calculateLuas();
    public abstract double calculateKeliling();
}
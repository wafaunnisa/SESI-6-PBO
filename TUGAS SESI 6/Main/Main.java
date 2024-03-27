package Main;

import BangunDatar.*;
import BangunRuang.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek untuk bangun datar
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Lingkaran lingkaran = new Lingkaran(3);
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(5, 4);

        // Memanggil metode untuk menghitung luas dan keliling
        System.out.println("Luas persegi: " + persegi.calculateArea());
        System.out.println("Keliling persegi: " + persegi.calculatePerimeter());

        System.out.println("Luas persegi panjang: " + persegiPanjang.calculateArea());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.calculatePerimeter());

        System.out.println("Luas lingkaran: " + lingkaran.calculateArea());
        System.out.println("Keliling lingkaran: " + lingkaran.calculatePerimeter());

        System.out.println("Luas segitiga sama sisi: " + segitigaSamaSisi.calculateLuas());
        System.out.println("Keliling segitiga sama sisi: " + segitigaSamaSisi.calculateKeliling());

        // Membuat objek-objek untuk bangun ruang
        Kubus kubus = new Kubus(5, 8);
        Balok balok = new Balok(4, 6, 10);
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(5, 10);

        // Memanggil metode untuk menghitung volume dan luas permukaan
        System.out.println("Volume kubus: " + kubus.calculateVolume());
        System.out.println("Luas permukaan kubus: " + kubus.calculateLuasPermukaan());

        System.out.println("Volume balok: " + balok.calculateVolume());
        System.out.println("Luas permukaan balok: " + balok.calculateLuasPermukaan());

        System.out.println("Volume bola: " + bola.calculateVolume());
        System.out.println("Luas permukaan bola: " + bola.calculateLuasPermukaan());

        System.out.println("Volume tabung: " + tabung.calculateVolume());
        System.out.println("Luas permukaan tabung: " + tabung.calculateLuasPermukaan());
    }
}

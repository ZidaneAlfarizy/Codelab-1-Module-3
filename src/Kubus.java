import java.util.Scanner;

public class Kubus extends BangunRuang {

    private Scanner scanner = new Scanner(System.in);
    private double sisi;

    Kubus(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Masukkan panjang sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}

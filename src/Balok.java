import java.util.Scanner;

public class Balok extends BangunRuang {

    Balok(String name) {
        super(name);
    }


    Scanner scanner = new Scanner(System.in);
    double length;
    double width;
    double height;


    @Override
    public void inputNilai() {

        super.inputNilai();
        System.out.print("Masukkan panjangnya: ");
        length = scanner.nextDouble();
        System.out.print("Masukkan lebarnya: ");
        width = scanner.nextDouble();
        System.out.print("Masukkan tingginya: ");
        height = scanner.nextDouble();
    }


    @Override
    public void luasPermukaan() {
        double surfaceArea = 2 * ((length * width) + (length * height) + (width * height));
        super.luasPermukaan();
        System.out.println("Luas permukaan: " + surfaceArea);
    }

    @Override
    public void volume() {
        double volume = length * width * height;
        super.volume();
        System.out.println("Volume: " + volume);
    }
}
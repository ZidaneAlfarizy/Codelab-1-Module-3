public class BangunRuang {
    private String nama;

    BangunRuang(String nama) {
        this.nama = nama;
    }

    public void inputNilai() {
        System.out.println("Masukkan nilai " + nama);
    }

    public void luasPermukaan() {
        System.out.println("Menghitung luas permukaan dari bangun " + nama);
    }

    public void volume() {
        System.out.println("Menghitung volume dari bangun " + nama);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

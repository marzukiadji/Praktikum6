public class Main {
    public static void main(String[] args) {
        // Membuat objek
        BangunDatar Lingkaran = new Lingkaran(14);
        BangunDatar Segitiga = new Segitiga(15, 10);
        BangunDatar Persegi = new Persegi(25, 15);

        // Memanggil Method Gambar
        Lingkaran.gambar();
        Segitiga.gambar();
        Persegi.gambar();
        System.out.println();

        System.out.println("Luas Lingkaran : "+ Lingkaran.luas());
        System.out.println("Luas Segitiga : " + Segitiga.luas());
        System.out.println("Luas Persegi : " + Persegi.luas());
    }
}

public class Segitiga extends BangunDatar {
    int alas, tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas(){
        return (float) (0.5 * (this.alas * this.tinggi));
    }
    @Override
    public void gambar(){
        System.out.println("Drawing Triangle");
    }
}

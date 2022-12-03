public class Persegi extends BangunDatar{
    float panjang, lebar;

    public Persegi(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas(){
        return (float) (this.panjang * this.lebar);
    }

    @Override
    public void gambar(){
        System.out.println("Drawing Rectangle");
    }
}

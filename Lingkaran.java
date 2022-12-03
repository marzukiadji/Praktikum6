import java.lang.Math;
public class Lingkaran extends BangunDatar {
    private float radius;

    public Lingkaran(float radius){
        this.radius = radius;
    }
    @Override
    public float luas(){
        return (float) (Math.PI * radius * radius);
    }
    @Override
    public void gambar(){
        System.out.println("Drawing Circle");
    }
}

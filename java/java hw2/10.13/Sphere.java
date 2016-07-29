/**
 * Created by dubo on 16/4/30.
 */
public class Sphere extends ThreeDimensionalShape{
    private double r;
    Sphere(double r){
        this.r=r;
    }
    @Override
    public double getArea(){
        return 4*Math.PI*r*r;
    }
    public double getVolume(){
        return (Math.PI *r *r*r)*4/3;
    }
    public String toString(){
        return String.format("Sphere's Area is %s Volume is %s%n",getArea(),getVolume());
    }
}

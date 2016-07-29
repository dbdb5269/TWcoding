/**
 * Created by dubo on 16/4/30.
 */
public class Cube extends ThreeDimensionalShape{
    private double x,y,z;
    Cube(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public double getArea(){
        return 2*(x*y+x*z+y*z);
    }
    public double getVolume(){
        return x*y*z;
    }
    public String toString(){
        return String.format("Cube's Area is %s Volume is %s%n",getArea(),getVolume());
    }
}

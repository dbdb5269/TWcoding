/**
 * Created by dubo on 16/4/30.
 */
public class Tetrahedron extends ThreeDimensionalShape{
    private double x;
    Tetrahedron(double x){
        this.x=x;


    }
    @Override
    public double getArea(){
        return Math.sqrt(3)*x*x;
    }
    public double getVolume(){
        return Math.sqrt(2)*(x*x*x)/12;
    }
    public String toString(){
        return String.format("Tetrahedron's Area is %s Volume is %s%n",getArea(),getVolume());
    }

}

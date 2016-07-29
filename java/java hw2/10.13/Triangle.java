/**
 * Created by dubo on 16/4/30.
 */
public class Triangle extends TwoDimensionalShape {
    private double x,y,z,p;
    Triangle(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
        this.p=(x+y+z)/2;
    }
    @Override
    public double getArea(){
        return Math.sqrt(p*(p-x)*(p-y)*(p-z)); //Heron's formula
    }
    public String toString(){
        return String.format("Triangle's Area is %s%n",getArea());
    }

}

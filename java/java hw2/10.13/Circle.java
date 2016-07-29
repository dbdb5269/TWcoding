/**
 * Created by dubo on 16/4/30.
 */
public class Circle extends TwoDimensionalShape {
    private double r;
    Circle(double r){
        this.r=r;
    }
    @Override
    public double getArea(){
        return  Math.PI * r * r;
    }
    public String toString(){
        return String.format("Circle's Area is %s%n",getArea());
    }
}

/**
 * Created by dubo on 16/4/30.
 */
public class Square extends TwoDimensionalShape{
    private double x,y;
    Square(double x,double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public double getArea(){
        return x*y;
    }
    public String toString(){
        return String.format("Square's Area is %s%n",getArea());
    }

}

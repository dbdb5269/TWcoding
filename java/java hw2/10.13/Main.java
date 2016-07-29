import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("請輸入circle,Sphere的半徑,以及tetrahedron邊長");

        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        System.out.println("請輸入square的长宽");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println("請輸入triangle,Cube的3邊");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        Circle circle=new Circle(r);
        Square square=new Square(x,y);
        Triangle triangle=new Triangle(a,b,c);
        Sphere sphere=new Sphere(r);
        Cube cube=new Cube(a,b,c);
        Tetrahedron tetrahedron=new Tetrahedron(r);
        Shape[] Array=new Shape[6];
        Array[0]=circle;
        Array[1]=square;
        Array[2]=triangle;
        Array[3]=sphere;
        Array[4]=cube;
        Array[5]=tetrahedron;
        for(Shape arr:Array){
            System.out.print(arr);
        }
    }
}

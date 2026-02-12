abstract class Shapes{
    double dim1;
    double dim2;
    Shapes(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}
class Rectangle extends Shapes{
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area() {
        return dim1 * dim2;
    }
}
class Triangle extends Shapes{
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area(){
        return 0.5 * dim1 * dim2;
    }
}
public class shape{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 4);
        Triangle t = new Triangle(5, 3);
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}

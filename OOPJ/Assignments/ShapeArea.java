
public class ShapeArea {
    public static void main(String args[]) {
        Shape sp;

        sp = new Circle();
        System.out.println("Circle area = " + sp.area(5));

        sp = new Rectangle();
        System.out.println("Rectangle area = " + sp.area(4, 6));
    }
}

abstract class Shape {
    double area;
    float PI = 3.14f;

    abstract public double area();
	
    abstract public double area(int x);         // e.g., circle
    abstract public double area(int x, int y);  // e.g., rectangle
}

class Rectangle extends Shape {
    @Override
    public double area(int l, int b) {
        area = l * b;
        return area;
    }

    @Override
    public double area(int x) {
        return 0; // not meaningful for rectangle
    }

    @Override
    public double area() {
        return 0; // optional default
    }
}

class Circle extends Shape {
    @Override
    public double area(int r) {
        area = PI * r * r;
        return area;
    }

    @Override
    public double area(int x, int y) {
        return 0; // not meaningful for circle
    }

    @Override
    public double area() {
        return 0; // optional default
    }
}

public class TestQue27 {
    public static void main(String args[]) {
        Shape sh1 = new Rectangle(4, 6);
        sh1.calculateArea();

        Shape sh2 = new Circle(5.5);
        sh2.calculateArea();

        Shape sh3 = new Square(3.3);
        sh3.calculateArea();
    }
}

interface Shape {
    public void calculateArea();
}

class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public void calculateArea() {
        double areaofcircle = 3.14 * r * r;
        System.out.println("Circle area = " + areaofcircle);
    }
}

class Rectangle implements Shape {
    int l, b;
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    public void calculateArea() {
        int areaofRect = l * b;
        System.out.println("Rectangle area = " + areaofRect);
    }
}

class Square implements Shape {
    double s;
    Square(double s) {
        this.s = s;
    }
    public void calculateArea() {
        double areaOfSquare = s * s;
        System.out.println("Square area = " + areaOfSquare);
    }
}

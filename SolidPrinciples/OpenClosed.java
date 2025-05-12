interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.72 * radius * radius;
    }

}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double area() {
        return 4 * side;
    }
}

class CalculateArea {
    public double calculateArea(Shape shape) {
        return shape.area();
    }

}


public class OpenClosed {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape square = new Square(4);

        CalculateArea calculate = new CalculateArea();
        System.out.println(calculate.calculateArea(circle));
    }
}
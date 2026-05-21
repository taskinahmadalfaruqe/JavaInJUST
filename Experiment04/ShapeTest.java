abstract class Shape {

  abstract double getArea();

  abstract double getPerimeter();

  void showInfo() {
    System.out.println("Area of the shape: " + getArea());
    System.out.println("Perimeter of the shape: " + getPerimeter());
  }
}

class Circle extends Shape {

  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double getArea() {
    return Math.PI * radius * radius;
  }

  double getPerimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle extends Shape {

  double length, width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getArea() {
    return length * width;
  }

  double getPerimeter() {
    return 2 * (length + width);
  }
}

public class ShapeTest {

  public static void main(String[] args) {
    Shape CircleArea = new Circle(5);
    Shape RectanglePerimeter = new Rectangle(4, 6);

    System.out.println("Area and Perimeter of Circle:");
    CircleArea.showInfo();
    System.out.println();

    System.out.println("Area and Perimeter of Rectangle:");
    RectanglePerimeter.showInfo();
  }
}

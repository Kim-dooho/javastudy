package pkg07_interface;

public class Circle implements Shape {
  
  private double radius; // 반지름 지정

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }
  
  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2); // 넓이 구하는 공식
  }

  @Override
  public double getCircum() {
    return 2 * Math.PI * radius; // 둘레 구하는 공식
  }

}

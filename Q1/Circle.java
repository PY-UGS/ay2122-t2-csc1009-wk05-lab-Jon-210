import java.lang.Math.*;

public class Circle extends GeometricObject{
  private double radius;

  public Circle(){
    
  }

  public Circle(double radius){
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled){
    this.radius = radius;
    this.color = color;
    this.filled = filled;
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return this.radius*this.radius*Math.PI;
  }

  public double getPerimeter(){
    return 2*Math.PI*this.radius;
  }

  public double getDiameter(){
    return 2*this.radius;
  }

  public void printCircle(){
    System.out.println("The radius is " + this.radius);
    System.out.println("The area is " + getArea());
    System.out.println("The diameter is " + getDiameter());
    System.out.println("The perimeter is " + getPerimeter());
  }


}
public class Rectangle extends GeometricObject{
  private double height;
  private double width;

  public Rectangle(){

  }

  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }

  public Rectangle(double width, double height, String color, boolean filled){
    this.width = width;
    this.height = height;
    this.color = color;
    this.filled = filled;
  }

  public double getWidth(){
    return width;
  }

  public void setWidth(double width){
    this.width = width;
  }

  public double getHeight(){
    return height;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public double getArea(){
    return this.width*this.height;
  }

  public double getPerimeter(){
    return 2*this.width+2*this.height;
  }
}
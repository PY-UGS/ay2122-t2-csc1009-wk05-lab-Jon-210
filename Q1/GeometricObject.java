import java.util.Date;

public class GeometricObject{
  public String color = "white";
  public boolean filled = false;
  Date dateCreated = new Date();

    //constructor no need to put return type
  public GeometricObject(){
    this.dateCreated = new Date();
  }

  public GeometricObject(String color, boolean filled){
    this.color = color;
    this.filled = filled;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public boolean isFilled(){
    return filled;
  }

  public void setFilled(boolean filled){
    this.filled = filled;
  }

  public String getDateCreated(){
    return dateCreated.toString();
  }
}
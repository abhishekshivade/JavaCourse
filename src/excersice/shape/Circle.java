package excersice.shape;
public class Circle extends Shape{
    private  int radius = 0;

    Circle(int radius){
        this.radius = radius;
    }

    public  int getRadius() {
        return radius;
    }

    public  void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    int calculateArea() {
        return (22*radius*radius)/7;
    }
}

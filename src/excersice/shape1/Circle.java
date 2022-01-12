package excersice.shape1;

public class Circle extends AreaOfShape{
    private int radius =0;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    int calculateArea() {
        return (22*radius*radius)/7;
    }
}

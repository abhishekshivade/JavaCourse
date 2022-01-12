package excersice.shape1;

public class Square extends AreaOfShape{

    private int side =0;
    public Square(int side){
        this.side = side;
    }

    @Override
    int calculateArea() {
        return side*side;
    }
}

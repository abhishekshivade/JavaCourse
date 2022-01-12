package excersice.shape;

public class Square extends Shape{
    private int side = 0;
    Square( int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    int calculateArea() {
        return side*side;
    }
}

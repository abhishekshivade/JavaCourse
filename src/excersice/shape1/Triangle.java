package excersice.shape1;

public class Triangle extends AreaOfShape{

    private int base, height = 0;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    int calculateArea() {
        return base*height/2;
    }
}

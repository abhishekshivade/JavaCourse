package excersice.shape;

public class Triangle extends Shape {
    private int base=0, height=0;

    public int getBase() {
        return base;
    }

    public void setBase(int b) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = height;
    }

    Triangle(){

    }
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    int calculateArea() {
        return base*height/2;
    }
}

package excersice.shape;

public class Rectangle extends Shape{
    private int width =0, height = 0;
    Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height*width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    int calculateArea() {
        return width*height;
    }
}

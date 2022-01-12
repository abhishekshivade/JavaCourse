package excersice.shape1;

public class Rectangle extends AreaOfShape {

   private int baser, heightr =0;

    public Rectangle(int baser, int heightr){
        this.baser = baser;
        this.heightr = heightr;
    }

    @Override
    int calculateArea() {
        return baser*heightr;
    }
}

package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side,side);
//        this.length = side;
//        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;

    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.width = side;

    }
}


//***Original Exercise****
//
// public class Square extends Rectangle {
//    public Square(int side) {
//        super(side, side);
//
//    }
//
//    public int getArea (){
//        int area = this.width * this.width;
//        return area;
//
//
////        **Alternate answer if keeping it private in rectangle class**
////        return this.getLength() * this.getWidth();
//
//    }
//
//
//    public int getPerimeter() {
//        int perimeter = 4 * this.length;
//        return perimeter;
//
//
////        **Alternate answer if keeping it private in rectangle class**
////        return this.getWidth() * 4;
//    }
//}

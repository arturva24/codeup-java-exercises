package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super();
        this.length = side;
        this.width = side;
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
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;

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

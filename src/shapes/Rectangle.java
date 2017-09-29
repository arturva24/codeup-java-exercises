package shapes;


public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}








//***Original Exercise***
//public class Rectangle {
//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//
//    }
//
//    public int getArea(){
//        int area= length * width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = 2 * length + 2 * width;
//        return perimeter;
//    }
//
////   ***If i wanted to keep it private and not protected use this get in square***
//// public int getLength(){
////        return this.length;
////    }
////
////    public int getWidth(){
////        return this.width;
////    }
//}
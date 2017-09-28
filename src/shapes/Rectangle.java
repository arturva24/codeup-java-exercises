package shapes;

public class Rectangle {
    protected int length;
    protected int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public int getArea(){
        int area= length * width;
        return area;
    }

    public int getPerimeter(){
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }

//   ***If i wanted to keep it private and not protected use this get in square***
// public int getLength(){
//        return this.length;
//    }
//
//    public int getWidth(){
//        return this.width;
//    }
}
package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);

    }

    public int getArea (){
        int area = this.width * this.width;
        return area;


//        **Alternate answer if keeping it private in rectangle class**
//        return this.getLength() * this.getWidth();

    }


    public int getPerimeter() {
        int perimeter = 4 * this.length;
        return perimeter;


//        **Alternate answer if keeping it private in rectangle class**
//        return this.getWidth() * 4;
    }
}

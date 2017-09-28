package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);

    }

    public int getArea (){
        int area = this.width * this.width;
        return area;

    }


    public int getPerimeter() {
        int perimeter = 4 * this.length;
        return perimeter;
    }
}

package shapes;

class Implement {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,4);
        Measurable mySquare = new Square(5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.getArea());
    }

}

//public class ShapesTest {
//
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square( 5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//    }
//
//}

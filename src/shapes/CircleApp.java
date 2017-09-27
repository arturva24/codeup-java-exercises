package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        Circle myCircle = new Circle(input.getDouble("Enter the radius:"));
        System.out.println("the area is : " + myCircle.getArea());
        System.out.println("The circumference is: " + myCircle.getCircumference());
    }
}

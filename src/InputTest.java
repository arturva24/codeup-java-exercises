import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        int number = input.getInt("Enter a number between 1 and 10",1, 10);
        System.out.println(number);

        System.out.println("You entered: " + number);
    }
}


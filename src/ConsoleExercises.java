import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your favorite color?");
        String color = scan.nextLine();
        System.out.println("Your favorite color is " + color);

        System.out.println("What's your favorite shape?");
        String shape = scan.next();
        System.out.println("Your favorite shape is " + shape);

        System.out.println("Whats your favorite animal?");
        String animal = scan.next();
        System.out.println("Your favorite animal is " + animal);

        System.out.println("Enter a sentence");
        String sentence = scan.next();
        System.out.println("Your sentence is " + sentence);

        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("You are " + age + " years old");

//        To accept decimal integers use the double
        System.out.println("Enter the width of the classroom");
        double width = scan.nextDouble();

        System.out.println("Enter the length of the classroom");
        int length = scan.nextInt();
        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        System.out.println("The area of the classroom is " + area);
        System.out.println("the perimeter of the calssroom is " + perimeter);





    }
}
//        System.out.print("Console Exercise test");

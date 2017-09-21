import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//            Fizz Buzz exercise

//        for (int counter = 1; counter <= 100; counter++) {
//            if (counter % 3 == 0 && counter % 5 == 0) {
//                System.out.println("FizzBuzz");
////
//            } else if (counter % 5 == 0) {
//                System.out.println("Buzz");
//
//            } else if (counter % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(counter);
//            }


        while (true) {
            System.out.println("Type in a number");
            int number = input.nextInt();
            input.nextLine();

            System.out.println("number | squared | cubed\n" + "------ | ------- | ------");

            for (int j = 1; j <= number; j++) {
                System.out.printf("%-7s| ", j);
                System.out.printf("%-8s| ", (j * j));
                System.out.printf("%-5s", (j * j * j));
                System.out.println();
            }

            System.out.println("Do you want to continue? y/n");
            String option = input.nextLine();

            if (!option.equalsIgnoreCase( "y")){
                System.out.println("Ok, good bye");
                break;
            }

        }
    }
}








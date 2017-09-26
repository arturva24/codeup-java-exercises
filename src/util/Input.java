package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String msg = input.nextLine();

//    }
    public String getString(){
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo(){
        System.out.println("y/n ?");
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }

    public int getInt(int min, int max){
        int userInput = getInt();
        if (userInput < min || userInput > max){
            System.out.println(userInput + " is not between  " + min + " and " + max);
            return getInt(min, max);
        }
        return userInput;

    }

    public int getInt(){
        if (this.scanner.hasNextInt()) {
            return this.scanner.nextInt();
        } else {
            System.out.println("Invalid Input!");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();

        if (userInput < min || userInput > max) {
            System.out.println(userInput + " is not between " + min + " and " + max);
        }
        return userInput;
    }

    public double getDouble(){
        if (this.scanner.hasNextDouble()){
            return this.scanner.nextDouble();
        } else {
            System.out.println("That's not an integer! Try again.");
            return getInt();
        }
    }

}

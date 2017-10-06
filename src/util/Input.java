package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String prompt;

    public String getString(){
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo(){
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }

    public int getInt(String prompt, int min, int max){
        int userInput = getInt(prompt);
        if (userInput < min || userInput > max){
            System.out.println(userInput + " is not between  " + min + " and " + max);
            return getInt(prompt, min, max);
        }
//        scanner.nextLine();
        return userInput;

    }

    public int getInt(String prompt){
        System.out.println(prompt);
        try{
            int input = Integer.valueOf(getString());
             return input;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid input! Try again!");
            return getInt(prompt);
        }
//        if (this.scanner.hasNextInt()) {
//            return this.scanner.nextInt();
//        } else {
//            System.out.println("Invalid Input!");
//            scanner.next();
//            return getInt(prompt);
//        }
    }

    public double getDouble(String prompt, double min, double max) {
        double userInput = getDouble(prompt);

        if (userInput < min || userInput > max) {
            System.out.println(userInput + " is not between " + min + " and " + max);
        }
//        scanner.nextLine();
        return userInput;
    }

    public double getDouble(String prompt){
        try{
            double input = Double.valueOf(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("That's not an integer! Try again!");
//            scanner.nextLine();
            return getDouble(prompt);
        }
//        if (this.scanner.hasNextDouble()){
//            return this.scanner.nextDouble();
//        } else {
//            System.out.println("That's not an integer! Try again.");
//            scanner.nextLine();
//            return getInt(prompt);
//        }
    }

}

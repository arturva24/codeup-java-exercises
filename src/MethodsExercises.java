import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        rollDice(getInteger(1,10));
        System.out.println(add(5,5));
        System.out.println(subtract(5,5));
        System.out.println(multiply(5,5));
        System.out.println(divide(5,5));


//        factorial (getInteger(1,10));

        getInteger(1, 10);
    }

//    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static void getInteger(int min, int max) {
        System.out.println("Enter a Number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput < 1 || userInput > 10) {
            System.out.println(userInput + " is not within range.");
            getInteger(min, max);

        } else {
            System.out.println(userInput + " is a great number!");
//
        }
    }


    public static void factorial(int number){
            int acum = 1;
            String details = "";
            for (int i = 1; i <= number; i++){
                details += (i == 1) ? i : " x " + i;
                System.out.println(i + "! =" + details + " = " + ( acum *= i));
            }
    }

    public static void rollDice( int sides, Scanner input){
        Scanner scan = new Scanner(System.in);
            while(true){

            }
    }

}





//    dice exercise
//
//    public static int roll(int userRoll, int compRoll);
//        System.out.println("Roll the dice");
//        Scanner input = new Scanner(System.in);
//        int userInfo = input.nextInt();
//
//        for (int userInfo = 0; userInfo < NUM_OF_GAMES; userInfo++) {
//        userRoll = roll();
//        compRoll = roll();
//
//        if(userRoll > compRoll) {
//            userWin++;
//    } else if (userRoll < compRoll) {
//            compWin++;
//        }else {
//            tied++;
//        }

//    public static void factorial(int min, int max) {
//        System.out.println("Enter a Number between 1 and 10");
//        Scanner input = new Scanner(System.in);
//        int userInput = input.nextInt();

//    }



//    public static void getInteger(int min, int max){ return userInput}


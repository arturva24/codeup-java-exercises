import java.util.Scanner;

import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        int randomNumber = aRandomNumber();
//        System.out.println(gamePick);
        System.out.println("Guess a number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int userPic = scan.nextInt();


        while (true)
            if (userPic < 1 || userPic > 100) {
                userPic = GetGuess();
            } else {
                break;
            }
        while(userPic != randomNumber) {
            if (userPic < randomNumber) {
                System.out.println("HIGHER");
                userPic = GetGuess();
            }
            else if (userPic > randomNumber) {
                System.out.println("LOWER");
                userPic = GetGuess();
            }

        }
        System.out.println("YOU GOT IT!");
    }

    public static int GetGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int userPic = scan.nextInt();
        return userPic;
    }


    public static int aRandomNumber() {
        int n = (int) (Math.random() * 100 + 1);

        return n;
    }
}
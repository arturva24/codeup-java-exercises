public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(subtract(5,5));
        System.out.println(multiply(5,5));
        System.out.println(divide(5,5));
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static int getInteger(int min, int max);
}

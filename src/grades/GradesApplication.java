package grades;

import java.util.HashMap;
import java.util.Random;

import util.Input;


public class GradesApplication {
    public static void main(String[] args) {
        HashMap <String, Student> usernames = new HashMap<>();
        Student zack =new Student("Zack");
        gradeGenerate(zack,5);
        Student ryan =new Student("Ryan");
        gradeGenerate(ryan,5);
        Student jason= new Student("Jason");
        gradeGenerate(jason,5);
        Student fernando= new Student("Fernando");
        gradeGenerate(fernando,5);
        Student luis= new Student("Luis");
        gradeGenerate(luis,5);


        usernames.put("zgulde", zack);
        usernames.put("ryanorsinger",ryan);
        usernames.put("jreich5", jason);
        usernames.put("fmendozaro", fernando);
        usernames.put("MontealegreLuis", luis);
        menu(usernames);

    }

    public static void gradeGenerate (Student student, int grades){
        Random randNum = new Random();
        int studentGrade;
        for (int i = 0; i < grades; i++) {
            studentGrade = randNum.nextInt(100);
            student.addGrade (studentGrade);
        }
    }

        public static void menu(HashMap<String, Student> map){
            Input input = new Input();
            String userInput;
            boolean cont;
            do {
                System.out.println("Welcome!\n");
                System.out.println("Here are the github usernames of our students:\n");
                System.out.print("| ");
                for(String keys:map.keySet()){
                    System.out.print(keys+" | ");
                }
                System.out.print("All |");
                System.out.println("\n");
                System.out.println("What student would you like to see more information on?\n");
                System.out.print("> ");
                userInput = input.getString();
                if (map.containsKey(userInput)) {
                    System.out.println(map.get(userInput).getName());
                    System.out.println(map.get(userInput).getGradeAverage());
                    System.out.println("----------------");

                } else if(userInput.equalsIgnoreCase("All")){
                    for(String keys : map.keySet()){
                        System.out.println(map.get(keys).getName());
                        map.get(keys).gradeList();
                        System.out.println(map.get(keys).getGradeAverage());
                        System.out.println("----------------");
                    }

                }else{
                    System.out.println("Sorry, no student found with the github username of " + userInput + "!");
                }
                System.out.println("Would you like to see another student? (y/n)");
                System.out.print("> ");
                cont=input.yesNo();
            }while(cont);
            System.out.println("Goodbye, and have a wonderful day!");
        }


}

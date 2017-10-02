package grades;

import java.util.HashMap;

import util.Input;


public class GradesApplication {
    public static void main(String[] args) {
        HashMap <String, Student> map = new HashMap<>();
        Student randy = new Student("Randy");
        randy.addGrade(100); randy.addGrade(50); randy.addGrade(0); randy.addGrade(70);
        Student ryan = new Student("Ryan");
        ryan.addGrade(90); ryan.addGrade(90); ryan.addGrade(80); ryan.addGrade(89);
        Student erik= new Student("Erik");
        erik.addGrade(100); erik.addGrade(90); erik.addGrade(95); erik.addGrade(91);
        Student ramiro= new Student("Ramiro");
        ramiro.addGrade(100); ramiro.addGrade(100); ramiro.addGrade(80); ramiro.addGrade(86);
        Student andy= new Student("Andy");
        andy.addGrade(100); andy.addGrade(97); andy.addGrade(96); andy.addGrade(97);

        map.put("gotskilz", randy);
        map.put("rchavez",ryan);
        map.put("ep187", erik);
        map.put("deadlyouth", ramiro);
        map.put("bloodywarrior", andy);
        menu(map);

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
                    System.out.println("Student: " + map.get(userInput).getName());
                    System.out.println("Username: " + (userInput));
                    System.out.println("Average " + map.get(userInput).getGradeAverage());
                    System.out.println("----------------");

                } else if(userInput.equalsIgnoreCase("All")){
                    for(String keys : map.keySet()){
                        System.out.println("Student: " + map.get(keys).getName());
                        System.out.println("Username: " + keys);
                        map.get(keys).gradeList();
                        System.out.println("Average " + map.get(keys).getGradeAverage());
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

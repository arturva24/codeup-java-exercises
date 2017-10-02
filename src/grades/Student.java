package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
//    private HashMap<String, String> attendance;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
//        this.attendance = new HashMap<>();
    }


    public String getName() {
        return this.name;
    }

//    public HashMap<String, String> getAttendance(){
//        return this.attendance;
//    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage () {
        double total = 0;
        for (Integer grade : grades){
            total += grade;
        }

        total /= grades.size();
        return total;
    }

    public void gradeList(){
        System.out.println(grades);
    }

//    public void perfectAttendance (String date String value) {
//        if(value.equalsIgnoreCase ("A") || value.equalsIgnoreCase("P")) {
//        }else if (date.length() == 5) {
//            this.attendance.put(date, value);
//        } else if{
//            System.out.println("Input date in form of MM-DD-YYYY");
//        } else {
//    }
//        System.out.println("P = Present; A = Absent");
//    }

//    public double showAtten

}

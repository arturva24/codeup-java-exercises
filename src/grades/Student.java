package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public boolean addGrade(int grade) {
        return grades.add(grade);
    }

    public double getGradeAverage () {
        double gradeAverage = 0;
        for (Integer grade : grades){
            gradeAverage += grade;
        }

        gradeAverage /= grades.size();
        return gradeAverage;
    }

    public void gradeList(){
        System.out.println(grades);
    }
}

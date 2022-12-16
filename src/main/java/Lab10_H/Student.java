package Lab10_H;

import Lab09_H.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {
    private Team group;
    private ArrayList<Double> grades;

    private ArrayList<Subject> subjects;

    public Student(Team group, ArrayList<Double> grades) {
        this.group = group;
        this.grades = grades;
        this.subjects = group.getSubjects();
    }

    public Student(String familia, String name, LocalDate birthdate, char sex, Team group, ArrayList<Double> grades) {
        super(familia, name, birthdate, sex);
        this.group = group;
        this.grades = grades;
        this.subjects = group.getSubjects();
    }

    public Team getGroup() {
        return group;
    }

    public void setGroup(Team group) {
        this.group = group;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrade(Double grade) {
        this.grades.add(grade);
    }

    public boolean examsPassed(){

        int count = 0;
        boolean ans = false;

        for(Double grade : this.grades){
            if(grade >= 56){
                count++;
            }
        }

        if(count == this.grades.size()){
            ans = true;
        }

        return ans;

    }

    public boolean isExcelent(){

        boolean ans = false;
        int count = 0;

        for(Double grade : this.grades){
            if(grade >= 90){
                count++;
            }
        }

        if(count == this.grades.size()){
            ans = true;
        }

        return ans;
    }

    public String printScores(){

        StringBuilder res = new StringBuilder();

        for(Double d: this.grades){
            res.append(d + ", ");
        }

        return  res+"";
    }

    public String getStudentInfo(){
        return "Фамилия: " + this.getFamilia() + "\n"
                + "Имя: " + this.getName() + "\n"
                + "Дата рождения: " + this.getBirthdate() + "\n"
                + "Пол: " + this.getSex() + "\n"
                + "Группа: " + this.getGroup() + "\n"
                + "Рейтинг: " + printScores() + "\n"
                + "Студент сдал сессия?: " + this.examsPassed();
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", grades=" + grades +
                ", subjects=" + subjects +
                '}';
    }
}

package Lab10_H;

import java.util.ArrayList;

public class Team {
    private String name;
    private int year;
    private ArrayList<Subject> subjects;

    public Team(String name, int year) {
        this.name = name;
        this.year = year;
        this.subjects = new ArrayList<>();
    }

    public void setSubject(Subject sub){
        this.subjects.add(sub);
    }

    public ArrayList<Subject> getSubject(Subject sub){
        return this.subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Subject> getSubjects(){
        return this.subjects ;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", subjects=" + subjects +
                '}';
    }
}

package Lab10_H;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject informatica = new Subject("Информатика", "экзамен");
        Subject matematica = new Subject("Математика", "экзамен");
        Subject ximia = new Subject("Химия", "экзамен");
        Subject ecologia = new Subject("Экология", "зачет");
        Subject fiscultura = new Subject("Физкультура", "зачет");

        // teams

        Team t1 = new Team("11-200", 2022);
        setSubjectsInArray(t1, informatica, matematica, fiscultura);

        Team t2 = new Team("07-201", 2022);
        setSubjectsInArray(t2, ximia, ecologia, matematica, fiscultura);


        System.out.println(t1);
        System.out.println(t2);

        // create student

        ArrayList<Double> gradesJoshua = new ArrayList<>();
        gradesJoshua.add(56.0);
        gradesJoshua.add(56.0);
        gradesJoshua.add(5.0);

        Student st = new Student("rodriguez", "joshua", LocalDate.of(2002, 4, 17), 'M', t1, gradesJoshua );


        Scanner input = new Scanner(System.in);

        int consol = 0;
        ArrayList<Student> studensGroupT1 = new ArrayList<>();

        do{
            System.out.println("Creating a studying in in the group 11-200");

            System.out.println("Insert the name: ");
            String name = input.nextLine();

            System.out.println("Insert the patronimic: ");
            String familia = input.nextLine();

            System.out.println("insert sex M/F: ");
            char se = input.nextLine().charAt(0);

            System.out.println("Birthday: ");

            System.out.println("year YYYY: ");
            int y = Integer.parseInt(input.nextLine());
            System.out.println("month MM: ");
            int m = Integer.parseInt(input.nextLine());
            System.out.println("day DD: ");
            int d = Integer.parseInt(input.nextLine());

            LocalDate g = LocalDate.of(y, m, d);


            ArrayList<Double> insertedGrades = new ArrayList<>();

            ArrayList<Subject> subjectsT1 = t1.getSubjects();

            System.out.println("Insert Grades: ");
            for(int i = 0; i < subjectsT1.size(); i++){

                String sname = subjectsT1.get(i).getName();

                System.out.println("grade for " + sname + " :");

                Double p = Double.parseDouble(input.nextLine());
                insertedGrades.add(p);
            }

            Student inputStudent = new Student(familia, name, g, se, t1 , insertedGrades);

            studensGroupT1.add(inputStudent);

            System.out.println("student created: ");
            System.out.println("This is your info");

            System.out.println(inputStudent.getStudentInfo());

            System.out.println("to create new student insert 1: ");
            System.out.println("to finish and see all students insert 2: ");
            consol = Integer.parseInt(input.nextLine());

        }
        while(consol != 2);


        System.out.println("all students: ");
        for(Student s: studensGroupT1){
            System.out.println(s.getStudentInfo());
            System.out.println("-----------------");
        }

    }

    public static void setSubjectsInArray(Team t, Subject ...a){
        for(Subject s: a){
            t.setSubject(s);
        }
    }
}

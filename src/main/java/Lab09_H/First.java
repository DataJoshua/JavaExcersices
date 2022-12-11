package Lab09_H;

import java.time.LocalDate;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Employee employee1 = new Employee("rodriguez", "josh", LocalDate.of(2002, 4, 17), 'M', 20000, 10);


        System.out.println("insert for second: ");
        Employee employee2 = Employee.insertFromConsole();
        System.out.println("insert for third employee: ");
        Employee employee3 = Employee.insertFromConsole();
        System.out.println("insert for fourth: ");
        Employee employee4 = Employee.insertFromConsole();
        System.out.println("Insert for fifth: ");
        Employee employee5 = Employee.insertFromConsole();

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        double totalTax = 0;
        double totalSalary = 0;
        Employee youngerEmployee = null;
        double minAge = 99;

        for(Employee e: employees){
            totalTax+= e.getTax();
            totalSalary += e.getSalaryWithBonus();
            if(e.getAge() < minAge){
                minAge = e.getAge();
                youngerEmployee = e;
            }
        }

        System.out.println("total taxes payed: ");
        System.out.println(totalTax);

        System.out.println("Average salary:");
        double avgSalary = totalSalary / employees.length;
        System.out.println(avgSalary);

        System.out.println("Younger employee in the team");
        System.out.println(youngerEmployee);


    }
}

class Employee extends Person{

    private double salary;
    private double bonus;

    public Employee(String familia, String name, LocalDate birthdate, char sex, double salary, double bonus) {
        super(familia, name, birthdate, sex);
        this.salary = salary;
        this.bonus = bonus/100;
    }

    public double getSalaryWithBonus(){
        return this.salary * (this.bonus + 1);
    }

    public double netSalary(){
        return getSalaryWithBonus() - getTax();
    }

    public static Employee insertFromConsole(){
        Scanner input = new Scanner(System.in);

        System.out.println("insert familia: ");
        String familia = input.nextLine();
        System.out.println("insert name: ");
        String name = input.nextLine();

        System.out.println("insert birthdate YY-MM-DD: ");
        // Local Date
        LocalDate birthDate = LocalDate.of(Integer.parseInt(input.nextLine()),
                Integer.parseInt(input.nextLine()),
                Integer.parseInt(input.nextLine()));

        System.out.println("insert M for male F for famale: ");
        char sex = input.nextLine().charAt(0);

        System.out.println("Insert Salary: ");
        double salary = Double.parseDouble(input.nextLine());

        System.out.println("Input Bonus%: ");
        double bonus = Double.parseDouble(input.nextLine());

        return new Employee(familia, name, birthDate, sex, salary, bonus);
    }

    public double getTax(){
        return  getSalaryWithBonus() * 0.13;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPremiun() {
        return bonus;
    }

    public void setPremiun(double premiun) {
        this.bonus = premiun;
    }
}

class EmployeeWithHours extends Employee{

    private int hoursWorked;

    public EmployeeWithHours(String familia, String name, LocalDate birthdate, char sex, double salary, double bonus, int hoursWorked) {
        super(familia, name, birthdate, sex, salary, bonus);
        this.hoursWorked = hoursWorked;
    }

    public double getSalaryWithBonus(){
        return getSalaryWithBonus() * this.hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
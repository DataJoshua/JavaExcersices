package Lab09_H;

import java.time.LocalDate;

public class Person {
    private String familia;
    private String name;
    private LocalDate birthdate;
    private char sex;


    public Person(){

    }

    public Person(String familia, String name, LocalDate birthdate, char sex) {
        this.familia = familia;
        this.name = name;
        this.birthdate = birthdate;
        this.sex = sex;
    }


    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public double getAge(){
        return LocalDate.now().getYear() - this.birthdate.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "familia='" + familia + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", sex=" + sex +
                '}';
    }
}

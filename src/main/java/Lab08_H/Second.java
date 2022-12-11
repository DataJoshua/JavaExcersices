package Lab08_H;

import java.time.LocalDate;
import java.util.*;


public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Person> persons = new ArrayList<>();

        String [] names = {"Maria", "Paola", "Andres", "Joshua"};

        char [] sexs = {'F', 'F', 'M', 'M'};

        String [] familias = {"rodriguez", "tearan", "Ivanobna"};


        ArrayList<LocalDate> ages = new ArrayList<>();

        ages.add(LocalDate.of(2002, 4, 17));
        ages.add(LocalDate.of(2003, 1, 2));
        ages.add(LocalDate.of(2001, 12, 20));
        ages.add(LocalDate.of(2002, 6, 12));
        ages.add(LocalDate.of(2001, 11, 9));
        ages.add(LocalDate.of(1999, 5, 10));


        for(int i = 0; i < n; i++){
            int randomFamilia = (int)(Math.random() * familias.length);
            int randomNames = (int)(Math.random() * names.length);
            int randomAges = (int) (Math.random() * ages.size());


            persons.add(new Person(familias[randomFamilia], names[randomNames],  ages.get(randomAges), sexs[randomNames]));
        }

        for(Person p: persons){
            System.out.println(p);
        }

    }
}

class Person{
    private String familia;
    private String name;
    private LocalDate birthdate;
    private char sex;


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

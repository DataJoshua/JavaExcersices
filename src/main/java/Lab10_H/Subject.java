package Lab10_H;

public class Subject {
    private String name;
    private String examForm;

    public Subject(String name, String examForm) {
        this.name = name;
        this.examForm = examForm;
    }

    public String getScore(Double score){
        if(this.examForm == "экзамен"){
            if(score > 0 && score <= 55){
                return "неудовлетворительно";
            }
            else if(score >= 56 && score <= 70){
                return "удовлетворительно";
            }
            else if(score >= 71 && score <= 85){
                return "хорошо";
            }
            else if(score >= 86 && score <= 100){
                return "отлично";
            }
        }
        else if(this.examForm == "зачет"){
            if(score <= 55){
                return "не зачтено";
            }
            else if(score >= 56 && score < 100){
                return "зачтено";
            }
        }
        return  "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExamForm() {
        return examForm;
    }

    public void setExamForm(String examForm) {
        this.examForm = examForm;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", examForm='" + examForm + '\'' +
                '}';
    }
}

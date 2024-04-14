package Lab3;

public class Study {
    private String course;

    //Конструктор, который принимает один параметр
    public Study(String course){
        this.course = course;
    }

    public String printCourse(){
        return this.course;
    }
}

class JavaProgram{
    public static void main (String[] args){
        //Объект study класса Study
        Study study = new Study("Изучение Java-это просто!");
        System.out.println(study.printCourse());
    }
}

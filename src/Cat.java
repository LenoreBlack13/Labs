public class Cat {
    private String name;
    private int age;
    private String breed;

    //Конструктор без параметров
    public Cat(){
        this.name = "Cat";
        this.age = 0;
        this.breed="Mestizo";
    }
    //Конструктор с параметрами
    public Cat(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}

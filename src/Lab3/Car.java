package Lab3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car(String color){
        this.color = color;
    }

    public Car(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public Car(){
    }

    public void printCar(){
        System.out.println("Car info: ");
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println();
    }
}

class CarProgram {
    public static void main(String[] args) {
        //Объекты класса Car
        Car car1 = new Car("Black");
        car1.printCar();

        Car car2 = new Car("Red", 2000);
        car2.printCar();
    }
}

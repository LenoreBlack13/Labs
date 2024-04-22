package Lab6;

public class Truck extends Car {
    public int wheel;
    public double maxWeight;

    public Truck(int weigh, String model, char color, float speed, int wheel, double maxWeight) {
        super(weigh, model, color, speed);
        this.wheel = wheel;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheel) {
        this.wheel = wheel;
        System.out.println(String.format("Установлено новое количество колес: %d", wheel));
    }
}

package Lab7;

public class Plane {
    public class Wing {
        private int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public void printWeightWing() {
            System.out.println(String.format("Вес крыла=%d кг", weight));
        }
    }

    public static void main(String[] args) {
        //Объект самолета
        Plane plane = new Plane();
        //Объекты крыла самолета
        Wing wing1 = plane.new Wing(1000);
        Wing wing2 = plane.new Wing(1200);
        //Вывод информации о весе крыльев
        wing1.printWeightWing();
        wing2.printWeightWing();
    }
}

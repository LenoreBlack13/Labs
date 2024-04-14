package Lab3;

import java.time.Year;

public class House {
    private int floor;
    private int year;
    private String name;

    public House(){}

    public void setHouse(int floor, int year, String name){
        this.floor = floor;
        this.year = year;
        this.name = name;
    }

    public void printHouse(){
        System.out.println("House: ");
        System.out.println("Name: " + name);
        System.out.println("Number of floors: " + floor);
        System.out.println("Year build: " + year);
    }

    public int yearHouse(){
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }
}

class HouseProgram {
    public static void main(String[] args) {
        House house = new House();
        house.setHouse(20, 2020, "Apartment building");
        house.printHouse();
        System.out.println();

        int yearsHouse = house.yearHouse();
        System.out.println("Age of house: " + yearsHouse);
    }
}
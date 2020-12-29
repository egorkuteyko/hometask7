package by.tms;

public class Main {
    public static void main(String[] args) {
        Auto car1 = new Auto(250, 250, 1, "mercedes", 4, 3,"hatchback", 5);
        System.out.println(car1.toString());
        car1.power(car1);
        car1.calculations(car1, 5);
        System.out.println("----------------------------------");
        Truck truck1 =  new Truck(400,300,2,"Ford", 8, 8,9);
        System.out.println(truck1.toString());
        truck1.power(truck1);
        truck1.load(truck1);
        System.out.println("----------------------------------");
        Civil civil1 = new Civil(1000, 1000, 10, "Boeing", 60, 800, 10000, true);
        System.out.println(civil1.toString());
        civil1.power(civil1);
        civil1.passengersLoad(civil1);
        System.out.println("----------------------------------");
        Military military1 = new Military(1150, 1200, 7, "UFO", 50, 500,true,0);
        System.out.println(military1.toString());
        military1.power(military1);
        military1.shoot(military1);
    }
}

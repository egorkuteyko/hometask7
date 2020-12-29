package by.tms;

public class Truck extends LandTransport{
    double capacity;

    public Truck(double horsePower, double maxSpeed, double weight, String model, int wheels, double fuelConsumption, double capacity) {
        super(horsePower, maxSpeed, weight, model, wheels, fuelConsumption);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public void power (Truck truck) {
        double power = truck.getHorsePower() * 0.74;
        System.out.println("мощность в киловаттах: " + power);
    }

    public void load (Truck truck) {
        if (truck.getCapacity() >= 0 && truck.getCapacity() < 10) {
            System.out.println("Грузовик загружен");
        }else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}

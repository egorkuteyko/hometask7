package by.tms;

public class LandTransport extends Transport {
    int wheels;
    double fuelConsumption;

    public LandTransport(double horsePower, double maxSpeed, double weight, String model, int wheels, double fuelConsumption) {
        super(horsePower, maxSpeed, weight, model);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

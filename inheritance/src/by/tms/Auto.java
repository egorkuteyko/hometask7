package by.tms;

public class Auto extends LandTransport{
    String bodyType;
    int passengers;

    public Auto(double horsePower, double maxSpeed, double weight, String model, int wheels, double fuelConsumption, String bodyType, int passengers) {
        super(horsePower, maxSpeed, weight, model, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "bodyType='" + bodyType + '\'' +
                ", passengers=" + passengers +
                ", wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';


    }

    public void calculations (Auto auto, int time) {
        double distance = auto.getMaxSpeed() * time;
        System.out.println("За время " + time + "ч автомобиль " + auto.getModel() + ", двигаясь с максимальной скоростью " + auto.getMaxSpeed() + "км/ч, проедет " + distance + "км и израсходует " + auto.fuelConsumptionCalculations(auto, time) + " литров топлива" );
    }
    private double fuelConsumptionCalculations (Auto auto, int time){
        double a = auto.getMaxSpeed() * time / 100 * auto.getFuelConsumption();
        return a;
    }
    public void power (Auto auto) {
        double power = auto.getHorsePower() * 0.74;
        System.out.println("мощность в киловаттах: " + power);
    }
}

package by.tms;

public class Civil extends AirTransport{
    int passengers;
    boolean businessClass;

    public Civil(double horsePower, double maxSpeed, double weight, String model, double wingSpread, double minRunWay, int passengers, boolean businessClass) {
        super(horsePower, maxSpeed, weight, model, wingSpread, minRunWay);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Civil{" +
                "wingSpread=" + wingSpread +
                ", minRunWay=" + minRunWay +
                ", passengers=" + passengers +
                ", businessClass=" + businessClass +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public void power (Civil civil) {
        double power = civil.getHorsePower() * 0.74;
        System.out.println("мощность в киловаттах: " + power);
    }

    public void passengersLoad (Civil civil) {
        if (civil.getPassengers() >= 0 && civil.getPassengers() < 200) {
            System.out.println("Самолет может взлететь");
        } else {
            System.out.println("Самолет перегружен");
        }
    }
 }

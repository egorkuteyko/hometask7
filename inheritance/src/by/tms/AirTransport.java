package by.tms;

public class AirTransport extends Transport{
    double wingSpread;
    double minRunWay;

    public AirTransport(double horsePower, double maxSpeed, double weight, String model, double wingSpread, double minRunWay) {
        super(horsePower, maxSpeed, weight, model);
        this.wingSpread = wingSpread;
        this.minRunWay = minRunWay;
    }

    public double getWingSpread() {
        return wingSpread;
    }

    public void setWingSpread(double wingSpread) {
        this.wingSpread = wingSpread;
    }

    public double getMinRunWay() {
        return minRunWay;
    }

    public void setMinRunWay(double minRunWay) {
        this.minRunWay = minRunWay;
    }
}

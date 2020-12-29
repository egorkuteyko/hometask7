package by.tms;

public class Military extends AirTransport{
    boolean catapult;
    int rockets;

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRockets() {
        return rockets;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }

    public Military(double horsePower, double maxSpeed, double weight, String model, double wingSpread, double minRunWay, boolean catapult, int rockets) {
        super(horsePower, maxSpeed, weight, model, wingSpread, minRunWay);
        this.catapult = catapult;
        this.rockets = rockets;

    }

    @Override
    public String toString() {
        return "Military{" +
                "wingSpread=" + wingSpread +
                ", minRunWay=" + minRunWay +
                ", catapult=" + catapult +
                ", rockets=" + rockets +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
    public void power (Military military) {
        double power = military.getHorsePower() * 0.74;
        System.out.println("мощность в киловаттах: " + power);
    }
    public void shoot (Military military) {
        if(military.getRockets() > 0) {
            System.out.println("Рокета пошла...");
        } else if(military.getRockets() == 0) {
            System.out.println("Боеприпасы отсутствуют");
        }

    }
}

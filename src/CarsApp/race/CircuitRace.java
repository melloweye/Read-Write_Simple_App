package CarsApp.race;

import CarsApp.car.Car;

public class CircuitRace extends Race {
    private int laps;

    public CircuitRace(int length, String route, int prize, Car[] competitorCars, int laps) {
        super(length, route, prize, competitorCars);
        this.laps = laps;
    }

    public CircuitRace() {}

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    @Override
    public String toString() {
        return "CircuitRace{" +
                "laps=" + laps +
                '}' + super.toString();
    }
}

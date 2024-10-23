package CarsApp.race;

import CarsApp.car.Car;

public class DriftRace extends Race {
    public DriftRace(int length, String route, int prize, Car[] competitorCars) {
        super(length, route, prize, competitorCars);
    }

    public DriftRace() {}

    @Override
    public String toString() {
        return "Дрифтовая гонка.";
    }
}

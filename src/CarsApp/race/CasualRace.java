package CarsApp.race;

import CarsApp.car.Car;

public class CasualRace extends Race {
    public CasualRace(int length, String route, int prize, Car[] competitorCars) {
        super(length, route, prize, competitorCars);
    }

    public CasualRace() {}

    @Override
    public String toString() {
        return "Обычная гонка.";
    }
}

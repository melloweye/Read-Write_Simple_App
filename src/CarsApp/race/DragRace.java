package CarsApp.race;

import CarsApp.car.Car;

public class DragRace extends Race {
    public DragRace(int length, String route, int prize, Car[] competitorCars) {
        super(length, route, prize, competitorCars);
    }

    public DragRace() {}

    @Override
    public String toString() {
        return "Гонка за самый мощный двигатель. Идеальное переключение передач — залог победы." + " " +
                super.toString();
    }
}

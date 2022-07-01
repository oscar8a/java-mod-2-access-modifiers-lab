import java.util.ArrayList;
import java.util.List;

class Garage {
    private List<Car> cars = new ArrayList<Car>();

    public void addCarToGarage(Car car) {
        System.out.println("...adding car");
        this.cars.add(car);
    }

    public void removeCarFromGarage() {
        System.out.println("Removing first car in the list");

        this.cars.remove(0);
    }

    public List<Car> getCars() {
        return cars;
    }
}

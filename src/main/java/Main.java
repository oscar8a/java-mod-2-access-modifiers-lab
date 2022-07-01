public class Main {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car eleanor = new Car(1967, "Shelby Mustang GT500", "Ford");
        Car nadine = new Car(1967, "265 GTB4            ", "Ferrari");
        Car bernadene = new Car(1994, "XJ 220              ", "Jaguar");
        Car basic = new Car(2000, "Yukon               ", "GMC");
        
        // System.out.println(garage.cars); // not visible
        
        garage.addCarToGarage(eleanor);
        garage.addCarToGarage(basic);
        garage.addCarToGarage(nadine);

        showGarage(garage);

        garage.addCarToGarage(basic);
        garage.addCarToGarage(basic);
        garage.addCarToGarage(bernadene);
        garage.addCarToGarage(basic);

        showGarage(garage);
        
        garage.removeCarFromGarage();
        
        showGarage(garage);
        
        garage.removeCarFromGarage();
        garage.removeCarFromGarage();
        
        showGarage(garage);
    }

    public static void showGarage(Garage garage) {
        System.out.println("Garage List:");
        for ( Car car : garage.getCars() ) {
            System.out.println("==> " + car.year + "  -  " + car.make + "  -  " + car.model);
        }
    }
}

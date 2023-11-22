package tr.com.workintech.model.company;

public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("GenericCar","description");
        System.out.println(carSkeleton.drive());
        System.out.println(carSkeleton.startEngine());

        //ElectricCar electricCar = new ElectricCar("Generic Car", "description");
       // ElectricCar hybridCar = new HybridCar("Generic Car", "description");
    }
}

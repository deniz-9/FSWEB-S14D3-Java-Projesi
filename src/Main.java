import tr.com.workintech.model.vehicle.Car;
import tr.com.workintech.model.vehicle.Ford;
import tr.com.workintech.model.vehicle.Holden;
import tr.com.workintech.model.vehicle.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new Car(8, "Base car");

        car.startEngine();
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");

        ford.startEngine();
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");

        holden.startEngine();
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}

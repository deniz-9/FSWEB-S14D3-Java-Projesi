package tr.com.workintech.model.vehicle;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Holden engine starting");
    }

    @Override
    public String accelerate() {
        return "Holden is accelerating";
    }

    @Override
    public String brake() {
        return "Holden is braking";
    }
}

package tr.com.workintech.model.vehicle;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Ford engine starting");
    }

    @Override
    public String accelerate() {
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        return "Ford is braking";
    }
}

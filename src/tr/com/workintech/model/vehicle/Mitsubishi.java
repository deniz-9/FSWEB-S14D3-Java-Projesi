package tr.com.workintech.model.vehicle;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi's engine starting");
    }

    @Override
    public String accelerate() {
        return "Mitsubishi's accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi's braking";
    }
}

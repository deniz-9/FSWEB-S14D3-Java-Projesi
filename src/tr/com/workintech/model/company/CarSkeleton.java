package tr.com.workintech.model.company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public  String startEngine(){
        return "CarSelectons engine is start";

    }
    public String drive(){
        runEngine();
        return "CarSelectons is driving";
    }
    protected void runEngine(){
        System.out.println("CarSelectons engine is running");
    }
}

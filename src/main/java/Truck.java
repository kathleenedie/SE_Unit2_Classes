import java.util.ArrayList;

public class Truck extends Vehicle{

    private ArrayList<Wheel> wheels;
    private Engine engine;

    public Truck(Engine engine) {
        this.wheels = new ArrayList<Wheel>();
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheel() {
        return this.wheels;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public ArrayList<Wheel> addWheel(Wheel wheel){
        wheels.add(wheel);
        return wheels;
    }

    public String moveWheels(){
        return "the wheels on the truck go 'round and 'round";
    }

    public String action(){
        return "We are moving";
    }

}

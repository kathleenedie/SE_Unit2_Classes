import com.sun.xml.internal.ws.api.pipe.Engine;

import java.util.ArrayList;

public class Truck extends Vehicle{

    private ArrayList<Wheel> wheel;
    private Engine engine;

    public Truck(Engine engine) {
        this.wheel = new ArrayList<Wheel>();
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheel() { return this.wheel;
    }

    public Engine getEngine(){
        return this.engine;
    }
}

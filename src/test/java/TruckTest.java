import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TruckTest {

    private Engine engine1;
    private Wheel wheel_fl;
    private Wheel wheel_fr;
    private Wheel wheel_rl;
    private Wheel wheel_rr;
    private Truck truck1;

    @Before
    public void before(){
        truck1 = new Truck(engine1);
    }


    @Test
    public void hasEngine(){
        assertEquals(engine1, truck1.getEngine());
    }

    @Test
    public void hasNoWheels(){
        assertEquals(0, truck1.getWheel().size());
    }

    @Test
    public void canAddWheel(){
        truck1.addWheel(wheel_fl);
        truck1.addWheel(wheel_fr);
        truck1.addWheel(wheel_rl);
        truck1.addWheel(wheel_rr);

        assertEquals(4, truck1.getWheel().size());
    }

    @Test
    public void canStartEngine(){
        assertEquals("Vroom, vroom", truck1.StartEngine());
    }

    @Test
    public void canMoveWheels(){
        assertEquals("the wheels on the truck go 'round and 'round", truck1.moveWheels());
    }
    @Test
    public void canCallAction(){
        assertEquals("We are moving", truck1.action());
    }
}

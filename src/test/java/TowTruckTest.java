import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TowTruckTest {

    private Engine engine1;
    private TowTruck towtruck1;

    @Before
    public void before(){
        towtruck1 = new TowTruck(engine1);
    }

    @Test
    public void hasEngine(){
        assertEquals(engine1, towtruck1.getEngine());
    }

    @Test
    public void hasEmptyWheelArray(){
        assertEquals(0, towtruck1.getWheel().size());
    }

    @Test
    public void canStartEngine(){
        assertEquals("Vroom, vroom", towtruck1.StartEngine());
    }

    @Test
    public void canMoveWheels(){
        assertEquals("the wheels on the truck go 'round and 'round", towtruck1.moveWheels());
    }
    @Test
    public void canCallAction(){
        assertEquals("We are moving", towtruck1.action());
    }

    @Test
    public void canHookCar(){
        assertEquals("Got that car!", towtruck1.hookCar());
    }

    @Test
    public void canTow(){
        assertEquals("Heave, heave!", towtruck1.tow());
    }
}

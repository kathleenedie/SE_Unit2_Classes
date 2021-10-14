import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GarbageTruckTest {

    private Engine engine1;
    private GarbageTruck rubbishlorry;
    private String entity1;

    @Before
    public void before(){
        rubbishlorry = new GarbageTruck(engine1, "gasket");
    }

    @Test
    public void hasEngine(){
        assertEquals(engine1, rubbishlorry.getEngine());
    }

    @Test
    public void hasEmptyWheelArray(){
        assertEquals(0, rubbishlorry.getWheel().size());
    }

    @Test
    public void canStartEngine(){
        assertEquals("Vroom, vroom", rubbishlorry.StartEngine());
    }

    @Test
    public void canMoveWheels(){
        assertEquals("the wheels on the truck go 'round and 'round", rubbishlorry.moveWheels());
    }
    @Test
    public void canCallAction(){
        assertEquals("We are moving", rubbishlorry.action());
    }

    @Test
    public void canHookBin(){
        assertEquals("Got a bin here", rubbishlorry.hookBin());
    }

    @Test
    public void canLift(){
        assertEquals("Lifting bins", rubbishlorry.lift());
    }

    @Test
    public void canRepairEntity(){
        assertEquals("I'm repairing the gasket", rubbishlorry.fix());
    }
}

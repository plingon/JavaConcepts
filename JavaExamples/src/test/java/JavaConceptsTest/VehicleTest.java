package JavaConceptsTest;

import JavaConcepts.Truck;
import JavaConcepts.Vehicle;
import org.junit.Test;

/**
 * Created by pling on 08/12/2016.
 */
public class VehicleTest {


    @Test
    public void vehicleTest() {
        Vehicle a = new Truck();
        a.start();
        //a.writeline is not accessible  , as writeline is a method inside truck class

        boolean state= a instanceof Truck;
        System.out.println("a is an instance of Truck : "+ state);

        System.out.println("Vehicle object");
        Vehicle b = new Vehicle();
        b.start();


        System.out.println("truck object");
        Truck c = new Truck();
        c.start();
        c.writeline();


    }
}

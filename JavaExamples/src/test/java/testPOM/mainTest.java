package testPOM;

import POM.Room;
import POM.School;
import org.junit.Test;

/**
 * Created by pling on 20/11/2016.
 */
public class mainTest {
     @Test
    public void POMTest()
    {
        Room r = new Room();
        r.setSpace(2000);
        School s= new School(r);
        s.teach();
        System.out.println("room space is : "+s.r.getSpace());

    }

}

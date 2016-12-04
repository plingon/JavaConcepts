package JavaConceptsTest;

import JavaConcepts.Agency;
import JavaConcepts.Spy;
import org.junit.Test;

/**
 * Created by pling on 03/12/2016.
 */
public class SpyTest {
    @Test
    public void displaySpyDetails()
    {
        Agency A1= new Agency();
        A1.AgencyName="AAA";
        A1.Country="France";
        Spy newR= new Spy();
        newR.CodeName= "007";
        newR.SpyAgency= A1;
        newR.DisplaySpyInfo();

    }
}

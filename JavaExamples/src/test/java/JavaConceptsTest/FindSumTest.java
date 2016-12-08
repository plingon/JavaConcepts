package JavaConceptsTest;

import JavaConcepts.FindSum;
import org.junit.Test;

/**
 * Created by pling on 08/12/2016.
 */
public class FindSumTest {
    @Test
    public void calculateSum()
    {
        FindSum calcSum= new FindSum();
        int count=4, result;
        result=calcSum.getSumOfOddNumbers(count);
        String message = String.format("Sum of first %d Odd Numbers is %d", count,result);
        System.out.println(message);



    }
}
